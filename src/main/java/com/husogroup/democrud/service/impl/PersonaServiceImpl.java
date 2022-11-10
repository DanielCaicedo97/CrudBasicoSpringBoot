package com.husogroup.democrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.husogroup.democrud.commons.GenericServiceImpl;
import com.husogroup.democrud.dao.api.PersonaDaoAPI;
import com.husogroup.democrud.model.Persona;
import com.husogroup.democrud.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI{

	@Autowired
	private PersonaDaoAPI personaDaoAPI;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		// TODO Auto-generated method stub
		return personaDaoAPI;
	}

}
