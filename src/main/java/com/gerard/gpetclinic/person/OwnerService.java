package com.gerard.gpetclinic.person;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner id);

    Set<Owner> findAll(Long id);

}
