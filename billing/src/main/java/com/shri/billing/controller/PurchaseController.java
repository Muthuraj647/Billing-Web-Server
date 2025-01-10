package com.shri.billing.controller;

import com.shri.billing.dto.OwnerPurchaseDto;
import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.service.impl.PurchaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired private PurchaseServiceImplementation purchaseServiceImplementation;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "purchases")
    ResponseEntity<List<PurchaseDto>> savePurchases(@RequestBody List<PurchaseDto> purchases){
        try{
            purchases = purchaseServiceImplementation.savePurchases(purchases);
        }catch (Exception e){
            e.printStackTrace();

        }

        return new ResponseEntity<>(purchases,HttpStatus.OK);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/purchases")
    ResponseEntity<List<OwnerPurchaseDto>> getAllPurchase(@RequestParam(required = false) Long id,
                                                          @RequestParam(required = false) String search){
        List<OwnerPurchaseDto> purchaseList =purchaseServiceImplementation.getAllPurchase(id,search);
        return new ResponseEntity<>(purchaseList,HttpStatus.OK);
    }

}
