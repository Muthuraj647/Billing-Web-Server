package com.shri.billing.service.impl;

import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.entity.Purchase;

import java.util.List;

public interface PurchaseServiceImplementation {

    List<PurchaseDto> savePurchases(List<PurchaseDto> purchases);

    List<PurchaseDto> getAllPurchase(Long id, String search);
}
