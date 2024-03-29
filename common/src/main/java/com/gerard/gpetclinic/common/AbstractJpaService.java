package com.gerard.gpetclinic.common;

import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;
import java.util.Set;

public class AbstractJpaService<T extends BaseEntity, R extends CrudRepository<T, Long>> implements CrudService<T, Long> {
    protected R repository;

    protected AbstractJpaService(R repository) {
        this.repository = repository;
    }

    @Override
    public Set<T> findAll() {
        Set<T> owners = new HashSet<>();
        repository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public T findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    public void delete(T object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
