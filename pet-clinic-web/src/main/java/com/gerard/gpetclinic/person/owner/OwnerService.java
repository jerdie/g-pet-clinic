package com.gerard.gpetclinic.person.owner;

import com.gerard.gpetclinic.common.CrudService;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
