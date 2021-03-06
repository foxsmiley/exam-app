package com.ropafadzom.examapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ropafadzom.examapp.models.*;
import com.ropafadzom.examapp.repositories.*;
@Service
public class RecordService {
	@Autowired
	private RecordRepository recordRepository;

	public void save(Record record) {
		recordRepository.save(record);
	}

	public void delete(int id) {
		recordRepository.delete(id);
	}

	public List<Record> findAll() {
		return recordRepository.findAll();
	}

	public Record findOne(int id) {
		return recordRepository.findOne(id);
	}
}
