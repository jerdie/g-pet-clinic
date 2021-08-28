package com.gerard.gpetclinic.pet;

import com.gerard.gpetclinic.common.BaseEntity;

import javax.persistence.Entity;

@Entity
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
