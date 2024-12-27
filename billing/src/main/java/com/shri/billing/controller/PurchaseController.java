package com.shri.billing.controller;

import com.shri.billing.dto.LookUpDto;
import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.entity.Purchase;
import com.shri.billing.service.impl.PurchaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired private PurchaseServiceImplementation purchaseServiceImplementation;

    @PostMapping(value = "purchases")
    ResponseEntity<List<PurchaseDto>> savePurchases(@RequestBody List<PurchaseDto> purchases){
        purchases = purchaseServiceImplementation.savePurchases(purchases);
        return new ResponseEntity<>(purchases,HttpStatus.OK);
    }
    @GetMapping
    ResponseEntity<List<PurchaseDto>> getAllPurchase(@RequestParam(required = false) Long id,
                                                     @RequestParam(required = false) String search){
        List<PurchaseDto> purchaseList =purchaseServiceImplementation.getAllPurchase(id,search);
        return new ResponseEntity<>(purchaseList,HttpStatus.OK);
    }
}
