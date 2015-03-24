package com.javacode.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javacode.model.Student;

@Controller
public class JsonController {

	@RequestMapping(value="/json", method=RequestMethod.GET)
	public ModelAndView returnJson(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String jsonString = null;
		Student student = new Student("Alice", "Testing");
		ModelAndView model = new ModelAndView("helloJson");
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

		model.addObject("msg", jsonString);
		return model;
	}

}
