package com.shri.billing.repository;

import com.shri.billing.dto.ModelDto;
import com.shri.billing.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

    @Query("select new com.shri.billing.dto.ModelDto(m.id,m.itemId,b.id as brandId,b.value as brandName, m.label as label,m.basePercentage) from Model m " +
            " inner join m.brand b " +
            " where (:id is null or m.id=:id) and (:search is null or m.label like :search escape '\\') and (:brand is null or :brand =b.id)")
    List<ModelDto> getAllModels(@Param("id") Long id,@Param("search") String search,@Param("brand") String brand);
}
