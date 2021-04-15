package com.gerard.gpetclinic.common;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T save(T object);
    T findById(ID id);
    void delete(ID id);
    void deleteById(ID id);
}
