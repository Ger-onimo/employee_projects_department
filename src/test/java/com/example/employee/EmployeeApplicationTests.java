package com.example.employee;

import com.example.employee.Models.Employee;
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

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee employee = new Employee("Christopher Christopher",50, 2, "christopherchristopher2@buisco.co.uk");
		Employee employee0 = new Employee("Christopher Christopher Christopher",49, 1, "christopherchristopher@buisco.co.uk");

		employeeRepository.save(employee0);
	}

}
