package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.Dto.EmployeeDto;

@Component
public interface EmployeeService {

	void saveEmployee(List<EmployeeDto> dtos);

	Optional<EmployeeDto> getOneEmployeeInfo(Integer empid);

	List<EmployeeDto> getAllEmployeeInfo();

}
