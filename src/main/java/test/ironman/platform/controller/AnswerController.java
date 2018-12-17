package test.ironman.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
	
	@RequestMapping("/AnswerControllerTest")
	public String test() {
		return "AnswerControllerReaching";
	}
	
	
	

}
