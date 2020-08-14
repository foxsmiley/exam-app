package com.ropafadzom.examapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ropafadzom.examapp.models.*;
import com.ropafadzom.examapp.repositories.*;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepository;

	public void save(Record record) {
		questionRepository.save(record);
	}

	public void delete(int id) {
		questionRepository.delete(id);
	}

	public List<Record> findAll() {
		return questionRepository.findAll();
	}

	public Record findOne(int id) {
		return questionRepository.findOne(id);
	}

}
