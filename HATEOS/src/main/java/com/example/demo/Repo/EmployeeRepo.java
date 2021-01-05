package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.EmployeeDto;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDto, Integer> {

	//void saveEmployee(EmployeeDto dto);

}
