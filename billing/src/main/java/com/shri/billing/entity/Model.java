package com.shri.billing.entity;

import com.shri.billing.lookup.Item;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Model {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @JoinColumn(name = "item_id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Item item;

    private String model;
    private String spec;
    private String label;
    private Long basePercentage;
}
