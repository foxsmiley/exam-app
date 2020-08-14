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
@RequestMapping("/record")
public class RecordController {
	@Autowired
	RecordService recordService;
	
	
	 @PostMapping("/add")
	    public void createCertificateTypes (@Valid @RequestBody Record records) {
	        try{
	        	this.recordSerivice.save(records);
	        }catch(Exception e) {}
	    }
	
	@GetMapping("")
	public ResponseEntity<List<Record>> findAll() {
		try {
			return ResponseEntity.ok().body(recordService.findAll());
		} catch (Exception exception) {
			return new ResponseEntity<List<Record>>(HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("{id}")
	public ResponseEntity<Record> findOne(@PathVariable int id) {
		try {
			return ResponseEntity.ok().body( recordService.findOne(id));
		} catch (Exception exception) {
			return new ResponseEntity<Record>(new Record(), HttpStatus.BAD_GATEWAY);
		}
	}

}
