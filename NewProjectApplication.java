package com.spring.newProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
package com.spring.newProject;

@Controller
@SpringBootApplication
public class NewProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" + "<li><a href='/doctor/1'>William Hartinell!</a></li>"
				+ "<li><a href='/doctor/2'>Patrick Troughton!</a></li>" 
				+ "<li><a href='/doctor/3'>Jon Pertwee!</a></li>"
				+ "<li><a href='Ddoctor/4'>Tom Baker!</a></li>" 
				+ "</ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "Tom baker";

	}

}

