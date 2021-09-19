package com.gerard.gpetclinic.pet;

import com.gerard.gpetclinic.common.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetType extends BaseEntity {

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
