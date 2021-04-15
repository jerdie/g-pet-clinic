package com.gerard.gpetclinic.person.owner;

import com.gerard.gpetclinic.common.AbstractMapService;
import com.gerard.gpetclinic.common.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
