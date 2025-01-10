document.getElementById("convert").addEventListener("click", () => {
    const fileInput = document.getElementById("csvFile");
    const output = document.getElementById("output");
  
    if (fileInput.files.length === 0) {
      alert("Please select a CSV file first!");
      return;
    }
  
    const file = fileInput.files[0];
    const reader = new FileReader();
  
    reader.onload = function (event) {
      const csvContent = event.target.result;
      const jsObject = csvToJson(csvContent);
      output.textContent = JSON.stringify(jsObject, null, 2); // Display the result
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
  
    return result.filter(row => Object.keys(row).length > 0); // Filter out empty rows
  }