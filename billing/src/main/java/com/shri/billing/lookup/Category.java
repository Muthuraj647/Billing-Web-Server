package com.shri.billing.lookup;

import com.shri.billing.entity.LookUp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
@DiscriminatorValue(value = "Category")
public class Category extends LookUp {
    public Category(String id) {
        super(id);
    }

    public Category() {
    }
}
