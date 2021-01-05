package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constraints.Constraints;
import com.example.demo.Dto.EmployeeDto;
import com.example.demo.Entity.EmployeeResponse;
import com.example.demo.Service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@Api("This is Employee Information")
public class EmployeeController {
	public Logger logger = Logger.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;

	@ApiOperation("This is Employee Save Method")
	@PostMapping(Constraints.SAVE_URL)
	public void saveEmployee() {
		logger.info("Employee Data is processing");
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
		logger.info("Employee Data is Setting:::" + dto);
		employeeService.saveEmployee(dtos);
		logger.info("Employee Data is Saved Successfully.");
	}

	@GetMapping(value = Constraints.GET_ONE_EMP_URL)
	public Optional<EmployeeDto> getOneEmployeInfo(@PathVariable("empid") Integer empid) {
		logger.info("Controller get the Path variable From UI:::" + empid);
		EmployeeDto dto=new EmployeeDto();
		Optional<EmployeeDto> oneEmployeeInfo = employeeService.getOneEmployeeInfo(empid);
		logger.info("Controller get the Path variable From UI:::" + oneEmployeeInfo);
		Link withSelfRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(EmployeeController.class).getALLEmployeInfo()).withSelfRel();
		RepresentationModel add = dto.add(withSelfRel);
		return oneEmployeeInfo;
	}
	
	@GetMapping(value = Constraints.GET_ALL_EMP_URL)
	public List<EmployeeDto> getALLEmployeInfo() {
		logger.info("Controller From UI:::");
		List<EmployeeDto> oneEmployeeInfo = employeeService.getAllEmployeeInfo();
		logger.info("Controller from BackEnd:::" +oneEmployeeInfo);
		return oneEmployeeInfo;
	}
}
