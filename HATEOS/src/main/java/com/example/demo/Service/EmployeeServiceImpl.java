package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.EmployeeDto;
import com.example.demo.Repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void saveEmployee(List<EmployeeDto> dto) {
		employeeRepo.saveAll(dto);		
	}

	@Override
	public Optional<EmployeeDto> getOneEmployeeInfo(Integer empid) {
		Optional<EmployeeDto> findById = employeeRepo.findById(empid);
		return findById;
	}

	@Override
	public List<EmployeeDto> getAllEmployeeInfo() {
		 List<EmployeeDto> findAll = employeeRepo.findAll();
		return findAll;
	}

	
}
