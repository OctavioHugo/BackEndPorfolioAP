package com.example.porfolio.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.porfolio.entities.Base;

public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
/*Tengo dudas de para que sirve esto*/
}
