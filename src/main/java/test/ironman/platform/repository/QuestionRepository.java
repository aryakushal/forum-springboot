package test.ironman.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.ironman.platform.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}