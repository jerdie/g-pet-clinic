package com.gerard.gpetclinic.person.vet;

import com.gerard.gpetclinic.common.AbstractMapService;
import com.gerard.gpetclinic.common.CrudService;
import com.gerard.gpetclinic.person.owner.Owner;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet, Long> {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
