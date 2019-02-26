package com.example.employee;

import com.example.employee.Models.Department;
import com.example.employee.Models.Employee;
import com.example.employee.Repositories.DepartmentRepository;
import com.example.employee.Repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateDepartmentandEmployees(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Christopher Christopher",50, 2, "christopherchristopher2@buisco.co.uk", department);
		Employee employee2 = new Employee("Christopher Christopher Christopher",49, 1, "christopherchristopher@buisco.co.uk", department);

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}

}
