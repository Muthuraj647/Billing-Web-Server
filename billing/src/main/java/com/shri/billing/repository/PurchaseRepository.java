package com.shri.billing.repository;

import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query(value = "select new com.shri.billing.dto.PurchaseDto(p.id as id ,p.orderId as orderId,p.orderDate as orderDate,c.id as categoryId," +
            "m.id as modelId,g.id as gradeId,p.imei as imei,p.trackingId,c.value as categoryValue,m.name as modelName,m.label as modelLabel," +
            "i.value as itemValue,g.value as gradeValue) from Purchase p " +
            " inner join p.category c " +
            " inner join p.grade g " +
            " inner join p.model m " +
            " inner join m.item i " +
            " where (:id = null or p.id =: id) and (:search is null or item.value like %:search%) " )
    List<PurchaseDto> getAllPurchase(@Param("id") Long id,@Param("search") String search);
}
