package com.gerard.gpetclinic.person;

import com.gerard.gpetclinic.pet.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll(long id);
}
