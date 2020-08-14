package com.ropafadzom.examapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ropafadzom.examapp.models.*;
import com.ropafadzom.examapp.repositories.*;
@Service
public class SolutionService {
	@Autowired
	private SolutionRepository solutionRepository;

	public void save(Solution solution) {
		solutionRepository.save(solution);
	}

	public void delete(int id) {
		solutionRepository.delete(id);
	}

	public List<Solution> findAll() {
		return solutionRepository.findAll();
	}

	public Solution findOne(int id) {
		return solutionRepository.findOne(id);
	}

}
