package com.gerard.gpetclinic.person.vet;

import com.gerard.gpetclinic.common.AbstractMapService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
