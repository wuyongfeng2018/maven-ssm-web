package com.wyf.service;

import java.util.List;

import com.wyf.model.Person;

/**
 * @author admin
 *
 */
public interface IPersonService {
	
	/**
	 * 加载全部person
	 * @return
	 */
	public List<Person> loadPersons();
}
