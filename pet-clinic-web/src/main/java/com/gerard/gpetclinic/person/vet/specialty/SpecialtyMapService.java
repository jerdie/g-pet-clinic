package com.gerard.gpetclinic.person.vet.specialty;

import com.gerard.gpetclinic.common.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty,Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }
}
