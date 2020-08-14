package com.ropafadzom.examapp.web;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.ropafadzom.examapp.models.*;
import com.ropafadzom.examapp.services.*;


@RestController
@CrossOrigin
@RequestMapping("/question")
public class QuestionsController {
	@Autowired
	QuestionService questionService;
	
	
	 @PostMapping("/add")
	    public void createCertificateTypes (@Valid @RequestBody Question questions) {
	        try{
	        	this.questionSerivice.save(questions);
	        }catch(Exception e) {}
	    }
	
	@GetMapping("")
	public ResponseEntity<List<Question>> findAll() {
		try {
			return ResponseEntity.ok().body(questionService.findAll());
		} catch (Exception exception) {
			return new ResponseEntity<List<Question>>(HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("{id}")
	public ResponseEntity<Question> findOne(@PathVariable int id) {
		try {
			return ResponseEntity.ok().body( questionService.findOne(id));
		} catch (Exception exception) {
			return new ResponseEntity<Question>(new Question(), HttpStatus.BAD_GATEWAY);
		}
	}

}
