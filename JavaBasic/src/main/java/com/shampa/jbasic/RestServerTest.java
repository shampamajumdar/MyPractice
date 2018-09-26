package com.shampa.jbasic;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServerTest {
	@RequestMapping(value="/hello/{kname}/{kage}", method=RequestMethod.GET)
	public String helloMethod(@PathVariable(value="kname")String name , 
			@PathVariable(value="kage")int age){
		return name + " is " + age + " yrs old."; 
	}
}
