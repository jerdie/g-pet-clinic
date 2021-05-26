package com.gerard.gpetclinic.person.vet;

import com.gerard.gpetclinic.common.AbstractMapService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }
}
