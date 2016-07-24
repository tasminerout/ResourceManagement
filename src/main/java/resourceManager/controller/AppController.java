package resourceManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import resourceManager.dto.Person;
import resourceManager.dto.Response;
import resourceManager.service.IAppService;

@Controller
public class AppController {

	@Autowired
	IAppService appService;
	
	@RequestMapping(value="/addPerson", method = RequestMethod.POST)
	public Response addPerson(@RequestBody Person person) {
		
		String serviceResponse = appService.addPerson(person);
		Response response = new Response();
		response.setResponseBody(serviceResponse);
		response.setStatusCode("200");
		response.setStatusMessage("SUCCESS");
		return response;
 
	}
	
	@RequestMapping(value="/allPersonnel", method = RequestMethod.GET)
	public Response getAllPersonList() {

		Response response = new Response();
		response.setResponseBody(appService.getAllPersonList());
		response.setStatusCode("200");
		response.setStatusMessage("SUCCESS");
		return response;
 
	}
	
}
