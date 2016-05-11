/**
 * @author chenwei
 *
 */
package com.boldwei.service;

import java.util.List;

import com.boldwei.model.Person;

public interface IPersonService { 
	/** 
	 * 
	 * * 加载全部的person
     * @return 
     * 
     * */ 
	List<Person> loadPersons();
}