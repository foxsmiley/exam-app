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
@RequestMapping("/solution")
public class SolutionController {
	@Autowired
	SolutionService solutionService;
	
	
	 @PostMapping("/add")
	    public void createCertificateTypes (@Valid @RequestBody Solution solutions) {
	        try{
	        	this.solutionSerivice.save(solutions);
	        }catch(Exception e) {}
	    }
	
	@GetMapping("")
	public ResponseEntity<List<Solution>> findAll() {
		try {
			return ResponseEntity.ok().body(solutionService.findAll());
		} catch (Exception exception) {
			return new ResponseEntity<List<Solution>>(HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("{id}")
	public ResponseEntity<Solution> findOne(@PathVariable int id) {
		try {
			return ResponseEntity.ok().body( solutionService.findOne(id));
		} catch (Exception exception) {
			return new ResponseEntity<Solution>(new Solution(), HttpStatus.BAD_GATEWAY);
		}
	}

}
