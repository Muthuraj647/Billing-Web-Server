
page = document.querySelector('body').getAttribute('id')

modelAPI='http://127.0.0.1:8081/model/models'
purchaseAPI='http://127.0.0.1:8081/purchase/purchases'


const keys = {
    orderId : "Order ID",
    orderDate:"Order Date",
    categoryId:"Buyback Category",  
    itemId:"Item ID",
    gradeId:"Granularity Buckets",
    imei:"IMEI",
    costDebitDate:"GC Redeem Time",
    costAmount:"GC Amount Redeemed",
    deliveryFee:"Delivery Fee",
    exchangeFee:"Exchange Facilitation Fee",
    trackingId:"Tracking ID"
}



if(page=="purchase"){
    loadPurchaseList(purchaseAPI);
}else if(page=="model"){
    loadPurchaseList(modelAPI);
}
else{
    addPurchase();
    bulkPurchase();
}


function publishData(formData){
    fetch('http://127.0.0.1:8081/purchase/purchases',{
        method:'POST',
        headers:{
            'Content-Type':'application/json'
        },
        body:JSON.stringify(formData)
    })
    .then(res=>{
        console.log(res)
        return res.json();

    })
    .then(
        data=>{
            console.log("data")
            
                if(confirm('New Entry Added')){
                    window.location.replace("../html/purchase.html");
                }
                

            
            
        }

    )
    .catch(err=>{
        console.log(err)
    })
}



async function loadPurchaseList(URI){
    let tbody = document.getElementById('tbody')
    let thead = document.querySelector('thead')
    let purchaseList;
    let errorMessage;

    // fetch('http://127.0.0.1:8081/purchase/list',{
    //     method:"GET",
    //     headers:{
    //         "Application-type":"application/json"
    //     }
    // }).then(response=>{
    //     return response.json()
    // }).then(data=>{
    //     purchaseList=data
        
    //     console.log(purchaseList)
        
    // }).catch(e=>{
    //     errorMessage=e
    //     console.log(e)
        
    // });

    // if(errorMessage!==undefined){

    // }else{
        
    //         console.log(purchaseList.length)
    //         document.getElementById('totalRecords').innerText="Total Records Found:"+ length(purchaseList);
        
    // }

    let response = await fetch(URI);
    if(response.ok){
        purchaseList = await response.json();

        document.getElementById('totalRecords').innerText="Total Records Found: "+purchaseList.length
    
        Object.keys(purchaseList[0]).forEach(element => {
            
            let th = document.createElement('th')
            
            th.textContent=splitCamelcase(element);
            thead.appendChild(th);
        });
        

         purchaseList.forEach(purchase => {
             console.log(purchase)
             let tr = document.createElement('tr')
             Object.values(purchase).forEach(element =>{
                let td= document.createElement('td')
                td.textContent=element
                tr.appendChild(td)
             });
             tbody.appendChild(tr)
            
         });
        

    }
}

function splitCamelcase(str){
    return str.replace(/([A-Z])/g," $1").replace(/^./, (str1)=>str1.toUpperCase());
}


function addPurchase(){
    let form = document.getElementById('addPurchase-form')

    let formData;
    let orderId=document.getElementById('orderId')
    let orderDate=document.getElementById('orderDate')
    let category=document.getElementById('category')
    let brand=document.getElementById('brand')
    let model=document.getElementById('model')
    let grade=document.getElementById('grade')
    let imei=document.getElementById('imei')
    let costDebitDate=document.getElementById('paymentDate')
    let cost=document.getElementById('productCost')
    let deliveryFee=document.getElementById('deliveryFee')
    let exchangeFee=document.getElementById('exchangeFee')
    let trackingId=document.getElementById('trackingId')

    let status;
    form.addEventListener("submit",(e)=>{
        e.preventDefault();

        formData = [{
            orderId : orderId.value,
            orderDate:formatDate(orderDate.value),
            categoryId:category.value,
            
            modelId:model.value,
            gradeId:grade.value,
            imei:imei.value,
            costDebitDate:formatDate(costDebitDate.value),
            costAmount:cost.value,
            deliveryFee:deliveryFee.value,
            exchangeFee:exchangeFee.value,
            trackingId:trackingId.value
        }]
    
        console.log(formData)
        publishData(formData)
    })

   
    
       
}

function formatDate(d){
    let date = new Date(d)
    const yyyy = date.getFullYear()
    const MM = String(date.getMonth()+1).padStart(2,'0')
    const dd = String(date.getDate()).padStart(2,'0')
    const HH = String(date.getHours()).padStart(2, '0');
    const mm = String(date.getMinutes()).padStart(2, '0');
    const ss = String(date.getSeconds()).padStart(2, '0');

    console.log(`${yyyy}-${MM}-${dd} ${HH}:${mm}:${ss}`)
    return `${yyyy}-${MM}-${dd} ${HH}:${mm}:${ss}`
}


function bulkPurchase(){
    document.getElementById("convert").addEventListener("click", () => {
        const fileInput = document.getElementById("csvFile");
        
      
        if (fileInput.files.length === 0) {
          alert("Please select a CSV file first!");
          return;
        }
      
        const file = fileInput.files[0];
        const reader = new FileReader();
      
        reader.onload = function (event) {
          const csvContent = event.target.result;
          const jsObject = csvToJson(csvContent);
          
          
          let data=jsObject.slice(0,-1);
          let dataFrame = JSON.stringify(data, null, 2); // Display the result
          console.log(data)

          //publishData(dataFrame)
        };
      
        reader.readAsText(file);
      });

       // Function to parse CSV into a JS object
  function csvToJson(csv) {
    const rows = csv.split("\n"); // Split by lines
    const headers = rows[0].split(","); // First row is the header
  
    const result = rows.slice(1).map(row => {
      const values = row.split(",");
      const obj = {};
      headers.forEach((header, index) => {
        obj[header.trim()] = values[index]?.trim(); // Map headers to values
      });
      return obj;
    });
    console.log("----\n"+result)
    return result.filter(row => Object.keys(row).length > 0); // Filter out empty rows
  }
}