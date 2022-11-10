package com.husogroup.democrud.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.husogroup.democrud.model.Persona;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
