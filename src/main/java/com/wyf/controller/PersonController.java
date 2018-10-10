package com.wyf.controller;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wyf.model.Person;
import com.wyf.service.IPersonService;

/**
 * @author admin
 *
 */
@Controller
@RequestMapping("/personController")
public class PersonController {
	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	private IPersonService personService;

	public IPersonService getPersonService() {
		return personService;
	}

	@Autowired
	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("/showPerson")
	public String showPersons(Model model) {
		
		List<Person> persons = personService.loadPersons();
		model.addAttribute("persons", persons);
		return "showperson";
	}

}
