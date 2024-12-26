package com.shri.billing.service;

import com.shri.billing.entity.Purchase;
import com.shri.billing.repository.PurchaseRepository;
import com.shri.billing.service.impl.PurchaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService implements PurchaseServiceImplementation {

    @Autowired private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }
}
