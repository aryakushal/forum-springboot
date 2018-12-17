package test.ironman.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import test.ironman.platform.model.Question;
import test.ironman.platform.repository.*;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;

	@GetMapping("/questions")
	public Page<Question> getQuestion(Pageable pageable) {
		return questionRepository.findAll( pageable );
	}
}
