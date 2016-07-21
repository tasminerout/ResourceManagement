package resourceManager.service;

import java.util.List;

import resourceManager.model.Person;

public interface IAppService {
	public String addPerson(Person person);
	public List<Person> getAllPersonList();
}
