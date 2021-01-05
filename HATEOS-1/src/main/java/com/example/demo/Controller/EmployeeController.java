package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constraints.Constraints;
import com.example.demo.Dto.EmployeeDto;

@RestController
@RequestMapping("/")
public class EmployeeController {
	@PostMapping(Constraints.SAVE_URL)
	public void saveEmployee() {
		EmployeeDto dto = new EmployeeDto(12345, "Bhaskar", new Date(), 10000.5);
		EmployeeDto dto1 = new EmployeeDto(12345, "Bhaskar", new Date(), 10000.5);
		EmployeeDto dto2 = new EmployeeDto(12345, "Bhaskar", new Date(), 10000.5);
		EmployeeDto dto3 = new EmployeeDto(12345, "Bhaskar", new Date(), 10000.5);
		EmployeeDto dto4 = new EmployeeDto(12345, "Bhaskar", new Date(), 10000.5);
		EmployeeDto dto5 = new EmployeeDto(12345, "Bhaskar", new Date(), 10000.5);
		List<EmployeeDto> dtos = new ArrayList<>();
		dtos.add(dto);
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		dtos.add(dto5);
	}

	@GetMapping(value = Constraints.GET_ONE_EMP_URL)
	public EmployeeDto getOneEmployeInfo(@PathVariable("empid") Integer empid) {
		EmployeeDto dto = new EmployeeDto(12345, "Bhaskar", new Date(), 10000.5);
		Link withSelfRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(EmployeeController.class).getALLEmployeInfo()).withSelfRel();
		Link link = withSelfRel.withSelfRel();
		dto.add(link);
		return dto;
	}
	
	@GetMapping(value = Constraints.GET_ALL_EMP_URL,produces ="application/json")
	public List<EmployeeDto> getALLEmployeInfo() {
		EmployeeDto dto = new EmployeeDto(123451, "Bhaskar", new Date(), 10000.5);
		EmployeeDto dto1 = new EmployeeDto(123452, "Bhaskar1", new Date(), 10000.5);
		EmployeeDto dto2 = new EmployeeDto(123453, "Bhaskar2", new Date(), 145.5);
		EmployeeDto dto3 = new EmployeeDto(123454, "Bhaskar3", new Date(), 2989658.5);
		EmployeeDto dto4 = new EmployeeDto(123455, "Bhaskar4", new Date(), 6325695.5);
		EmployeeDto dto5 = new EmployeeDto(123456, "Bhaskar5", new Date(), 68598.5);
		List<EmployeeDto> dtos = new ArrayList<>();
		dtos.add(dto);
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		dtos.add(dto5);
		return dtos;
	}
}
