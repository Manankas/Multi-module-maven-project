package project.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

	@RequestMapping(value="/project/",method=RequestMethod.GET )
	public String add(){
			return  "hello";		
	}
}
