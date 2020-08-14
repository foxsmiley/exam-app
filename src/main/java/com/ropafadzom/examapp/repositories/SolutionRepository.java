package com.ropafadzom.examapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ropafadzom.examapp.models.*;

public interface SolutionRepository extends JpaRepository<Solution, Long> {

}