package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	@RequestMapping("/")
     @ResponseBody
     public String index() {
         return "<html><head><title>Doctor Who</title></head><body><p>Greetings from Spring Boot!</p><ul><li><a href=\"doctor/1\">William Hartnell</a></li><li><a href=\"doctor/2\">Ben Aaronovitch</a></li><li><a href=\"doctor/10\">David Tennant</a></li><li><a href=\"doctor/13\">Jodie Whittaker</a></li></ul></body></html>";
     }


	@RequestMapping("/doctor/1")
	      @ResponseBody
	      public String doctor_1() {
	          return "William Hartnell";
	      }

	@RequestMapping("/doctor/2")
		@ResponseBody
			public String doctor_2() {
					  return "Ben Aaronovitch";
					}

	@RequestMapping("/doctor/10")
			@ResponseBody
				public String doctor_10() {
				  return "David Tennant";
										}
	@RequestMapping("/doctor/13")
			@ResponseBody
			public String doctor_13() {
		return "Jodie Whittaker";
			}

}
