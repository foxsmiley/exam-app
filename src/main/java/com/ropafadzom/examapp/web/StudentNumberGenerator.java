package com.ropafadzom.examapp.web;


import org.springframework.beans.factory.annotation.Autowired;
import com.ropafadzom.examapp.services.*;
import java.util.*;

public class StudentNumberGenerator {
	@Autowired
	UserServiceImpl userService;
	Random rand = new Random();
	String fixedSequence = "T20";
	int numbers;
	
	
	public String generatreStudentNumber() {
		int max = 999;
		int min = 000;
		this.numbers = rand.nextInt((max-min) + 1) + min;
		
		String generatedStudentNumber = this.fixedSequence + this.numbers;
        
			return generatedStudentNumber;
		
	}
	
	

}
