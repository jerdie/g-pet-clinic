package com.gerard.gpetclinic.pet;

import com.gerard.gpetclinic.common.BaseEntity;
import com.gerard.gpetclinic.person.owner.Owner;
import com.gerard.gpetclinic.visit.Visit;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet extends BaseEntity {

    private String name;
    private LocalDate birthDate;

    @ManyToOne
    private PetType petType;

    @ManyToOne
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits;

    public LocalDate getBirthDate() {
        return birthDate;
    }

}
