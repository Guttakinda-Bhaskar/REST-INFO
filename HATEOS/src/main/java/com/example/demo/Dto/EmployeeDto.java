package com.example.demo.Dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.hateoas.RepresentationModel;

@Table(name = "Employee_Db")
@Entity
@XmlRootElement
public class EmployeeDto extends RepresentationModel<EmployeeDto> 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
