package com.shri.billing.lookup;

import com.shri.billing.entity.LookUp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Brand")
public class Brand extends LookUp {
    public Brand(String id) {
        super(id);
    }
}
