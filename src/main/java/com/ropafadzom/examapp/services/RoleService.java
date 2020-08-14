package com.ropafadzom.examapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ropafadzom.examapp.models.*;
import com.ropafadzom.examapp.repositories.*;
@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;

	public void save(Role role) {
		roleRepository.save(role);
	}

	public void delete(int id) {
		roleRepository.delete(id);
	}

	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	public Role findOne(int id) {
		return roleRepository.findOne(id);
	}
}
