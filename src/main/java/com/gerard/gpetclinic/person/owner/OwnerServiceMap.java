package com.gerard.gpetclinic.person.owner;

import com.gerard.gpetclinic.common.AbstractMapService;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
