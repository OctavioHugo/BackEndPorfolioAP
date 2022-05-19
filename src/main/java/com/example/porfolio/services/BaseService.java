package com.example.porfolio.services;

import java.io.Serializable;
import java.util.List;

import com.example.porfolio.entities.Base;

public interface BaseService<E extends Base, ID extends Serializable> /*Dudas sobre las extension a base y la implementacion*/ {
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E upDate(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
