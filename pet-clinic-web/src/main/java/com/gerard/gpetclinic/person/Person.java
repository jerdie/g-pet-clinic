package com.gerard.gpetclinic.person;

import com.gerard.gpetclinic.common.BaseEntity;
import lombok.*;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
