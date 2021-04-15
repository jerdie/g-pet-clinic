package com.gerard.gpetclinic.person;

import com.gerard.gpetclinic.common.CrudService;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
