package resourceManager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resourceManager.dto.Person;
import resourceManager.model.DataStore;
import resourceManager.service.IAppService;

@Service
public class AppService implements IAppService{
	
	@Autowired
	DataStore store;
	
	public String addPerson(Person person){
		store.getStore().add(person);
		return "successfully added person ::".concat(person.getName());
	}
	
	public List<Person> getAllPersonList(){
		return store.getStore();
	}
}
