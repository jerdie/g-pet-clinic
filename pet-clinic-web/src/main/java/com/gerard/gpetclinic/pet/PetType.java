package com.gerard.gpetclinic.pet;

import com.gerard.gpetclinic.common.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PetType extends BaseEntity {

    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
