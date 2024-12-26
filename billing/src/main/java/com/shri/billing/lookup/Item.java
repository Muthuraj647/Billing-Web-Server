package com.shri.billing.lookup;

import com.shri.billing.entity.LookUp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue(value = "Item")
@NoArgsConstructor
public class Item extends LookUp {
    public Item(String id) {
        super(id);
    }
}
