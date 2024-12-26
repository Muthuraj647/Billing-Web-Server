package com.shri.billing.repository;

import com.shri.billing.dto.LookUpDto;
import com.shri.billing.entity.LookUp;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LookUpRepository extends JpaRepository<LookUp , String> {

    @Query(value = "select id,value,description,group_name from look_up where find_in_set(group_name, :groupNames)",nativeQuery = true)
    List<Tuple> getAllLookUpGroupNames(@Param("groupNames") String groupNames);
}
