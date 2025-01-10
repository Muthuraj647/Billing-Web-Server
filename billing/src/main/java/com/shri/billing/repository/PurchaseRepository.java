package com.shri.billing.repository;

import com.shri.billing.dto.OwnerPurchaseDto;
import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query(value = "select new com.shri.billing.dto.OwnerPurchaseDto(p.id as id,p.trackingId,p.orderDate as orderDate,p.gradeId as gradeId, " +
            " p.imei as imei,p.purchaseAmount,c.value as categoryValue,m.label as modelLabel) from Purchase p " +
            " left join p.category c " +
            " left join p.model m ")
    List<OwnerPurchaseDto> getAllPurchase();
}
