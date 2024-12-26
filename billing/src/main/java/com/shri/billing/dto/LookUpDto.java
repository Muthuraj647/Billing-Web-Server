package com.shri.billing.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@NoArgsConstructor
public class LookUpDto {
    private String id;
    private String value;
    private String description;
    private String groupName;

    public LookUpDto(String id, String value, String description, String groupName) {
        this.id=id;
        this.value=value;
        this.description=description;
        this.groupName=groupName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
