package com.gerard.gpetclinic.person.vet.specialty;

import com.gerard.gpetclinic.common.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Specialty extends BaseEntity {

    private String description;

}
