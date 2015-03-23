package com.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Student;

@Controller
@RequestMapping("/hello")
public class MovieController {

	@RequestMapping(method = RequestMethod.GET)
	public String printJson() {
		String jsonString = null;
		Student student = new Student("Alice", "Testing");
		ObjectWriter writer = new ObjectMapper().writer()
				.withDefaultPrettyPrinter();
		try {
			jsonString = writer.writeValueAsString(student);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return jsonString;		

		
	}
}
