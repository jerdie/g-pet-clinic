package com.gerard.gpetclinic.person.vet.specialty;

import com.gerard.gpetclinic.common.BaseEntity;
import javax.persistence.Entity;

@Entity
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
