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
@RequestMapping("/role")
public class RoleController {
	@Autowired
	RoleService roleService;
	
	
	 @PostMapping("/add")
	    public void createCertificateTypes (@Valid @RequestBody Role roles) {
	        try{
	        	this.roleSerivice.save(roles);
	        }catch(Exception e) {}
	    }
	
	@GetMapping("")
	public ResponseEntity<List<Role>> findAll() {
		try {
			return ResponseEntity.ok().body(roleService.findAll());
		} catch (Exception exception) {
			return new ResponseEntity<List<Role>>(HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("{id}")
	public ResponseEntity<Role> findOne(@PathVariable int id) {
		try {
			return ResponseEntity.ok().body( roleService.findOne(id));
		} catch (Exception exception) {
			return new ResponseEntity<Role>(new Role(), HttpStatus.BAD_GATEWAY);
		}
	}

}
