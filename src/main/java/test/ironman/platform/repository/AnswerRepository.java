package test.ironman.platform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import test.ironman.platform.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
	
	List<Answer> findByQuestionId(Long questionId);

}
