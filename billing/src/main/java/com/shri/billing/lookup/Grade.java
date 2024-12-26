package com.shri.billing.lookup;

import com.shri.billing.entity.LookUp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Grade")
public class Grade extends LookUp {
    public Grade(String id) {
        super(id);
    }
}
