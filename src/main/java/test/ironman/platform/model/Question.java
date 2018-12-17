package test.ironman.platform.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
	private Long id;
	
	@NotBlank
	@Size(min=5, max=100)
	private String title;
	
	@Column(columnDefinition="text")
	private String description;

	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
