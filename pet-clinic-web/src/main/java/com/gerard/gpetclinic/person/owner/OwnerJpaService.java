package com.gerard.gpetclinic.person.owner;

import com.gerard.gpetclinic.common.AbstractJpaService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa")
class OwnerJpaService extends AbstractJpaService<Owner, OwnerRepository> implements OwnerService {

    public OwnerJpaService(OwnerRepository ownerRepository) {
        super(ownerRepository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return repository.findAllByLastNameLike(lastName);
    }
} 
