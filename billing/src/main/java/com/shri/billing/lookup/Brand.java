package com.shri.billing.lookup;

import com.shri.billing.entity.LookUp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
@DiscriminatorValue(value = "Brand")
public class Brand extends LookUp {
    public Brand(String id) {
        super(id);
    }

    public Brand() {
    }
}
