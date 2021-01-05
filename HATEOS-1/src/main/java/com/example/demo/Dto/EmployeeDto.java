package com.example.demo.Dto;

import java.util.Date;

import org.springframework.hateoas.RepresentationModel;

public class EmployeeDto extends RepresentationModel<EmployeeDto> 
{
	private Integer empid;
	private String empname;
	private Date joinDate;
	private Double salary;

	public EmployeeDto(Integer empid, String empname, Date joinDate, Double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empid=" + empid + ", empname=" + empname + ", joinDate=" + joinDate + ", salary=" + salary
				+ "]";
	}

}
