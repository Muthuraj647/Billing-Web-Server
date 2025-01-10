package com.shri.billing.service;

import com.shri.billing.dto.OwnerPurchaseDto;
import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.entity.Model;
import com.shri.billing.entity.Purchase;
import com.shri.billing.lookup.Category;
import com.shri.billing.repository.PurchaseRepository;
import com.shri.billing.service.impl.PurchaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseService implements PurchaseServiceImplementation {

    @Autowired private PurchaseRepository purchaseRepository;


    @Override
    public List<PurchaseDto> savePurchases(List<PurchaseDto> purchases) {
        List<Purchase> purchaseList =new ArrayList<>();
        for(PurchaseDto dto :purchases){
            Purchase purchase =new Purchase();
            purchase.setOrderId(dto.getOrderId());
            purchase.setOrderDate(dto.getOrderDate());
            purchase.setCategory( dto.getCategoryId()!=null?new Category(dto.getCategoryId()):null);
            purchase.setModel(dto.getModelId()!=null?new Model(dto.getModelId()):null);
            purchase.setGradeId(dto.getGradeId());
            purchase.setImei(dto.getImei());
            purchase.setCostAmount(dto.getCostAmount());
            purchase.setCostDebitDate(dto.getCostDebitDate());
            purchase.setDeliveryFee(dto.getDeliveryFee());
            purchase.setExchangeFee(dto.getExchangeFee());
            purchase.setTrackingId(dto.getTrackingId());
            purchase.setPurchaseAmount(dto.getCostAmount()+dto.getDeliveryFee()+dto.getExchangeFee());
            purchaseList.add(purchase);
        }
        purchaseRepository.saveAll(purchaseList);
        return purchases;
    }

    @Override
    public List<OwnerPurchaseDto> getAllPurchase(Long id, String search) {
        List<OwnerPurchaseDto> purchaseList = purchaseRepository.getAllPurchase();
        return purchaseList;
    }

}
