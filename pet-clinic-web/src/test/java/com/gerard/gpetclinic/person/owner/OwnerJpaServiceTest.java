package com.gerard.gpetclinic.person.owner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {
    @Mock
    OwnerRepository repository;

    @InjectMocks
    OwnerJpaService ownerJpaService;

    Owner returnOwner;
    @BeforeEach
    void setup(){
        long id = 1L;
        returnOwner = Owner.builder().id(id).lastName("LAST").build();
    }

    @Test
    void findAll() {
        Set<Owner> ownerDataList = new HashSet<>();
        ownerDataList.add(Owner.builder().id(1L).lastName("LAST").build());
        ownerDataList.add(Owner.builder().id(2L).lastName("LAST").build());
        when(ownerJpaService.findAll()).thenReturn(ownerDataList);
        Set<Owner> owners = ownerJpaService.findAll();
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        long id = 1L;
        when(repository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        Owner owner = ownerJpaService.findById(id);

        assertEquals(id, owner.getId());
    }

    @Test
    void delete() {
        ownerJpaService.delete(returnOwner);
        verify(repository).delete(any());
    }

    @Test
    void deleteById() {
        ownerJpaService.deleteById(1L);
        verify(repository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {
        String lastName = "LAST";
        when(repository.findByLastName(anyString())).thenReturn(returnOwner);

        Owner owner = ownerJpaService.findByLastName(lastName);

        assertEquals("LAST", owner.getLastName());

    }

    @Test
    void findByLastNameNotFound() {
        String lastName = "NOT EXIST";
        when(repository.findByLastName(anyString())).thenReturn(null);

        Owner owner = ownerJpaService.findByLastName(lastName);

        assertNull(owner);

    }

}