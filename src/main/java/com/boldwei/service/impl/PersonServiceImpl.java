/**
 * @author chenwei
 *
 */
package com.boldwei.service.impl;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boldwei.dao.PersonMapper;
import com.boldwei.model.Person;
import com.boldwei.service.IPersonService;

@Service("personService") 
public class PersonServiceImpl implements IPersonService { 
	private PersonMapper personMapper; 
	public PersonMapper getPersonMapper() { 
		return personMapper;
	}
	@Autowired 
	public void setPersonMapper(PersonMapper personMapper) { 
		this.personMapper = personMapper;
	}
	public List<Person> loadPersons() { 
		return personMapper.queryAll();
	}

}