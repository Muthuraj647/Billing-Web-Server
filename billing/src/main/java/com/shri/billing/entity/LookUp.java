package com.shri.billing.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,name = "group_name",columnDefinition = "varchar(255)")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
@AllArgsConstructor
public class LookUp {
    @Id
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String value;
    private String description;
//    private String groupName;

    public LookUp(String id) {
        this.id = id;
    }
}
