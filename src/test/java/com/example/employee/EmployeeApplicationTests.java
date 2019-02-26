package com.example.employee;

import com.example.employee.Models.Department;
import com.example.employee.Models.Employee;
import com.example.employee.Models.Project;
import com.example.employee.Repositories.DepartmentRepository;
import com.example.employee.Repositories.EmployeeRepository;
import com.example.employee.Repositories.ProjectRepository;
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

	@Autowired
	ProjectRepository projectRepository;

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

	@Test
	public void canCreateEmployeAndProject(){
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Christopher Christopher",50, 2, "christopherchristopher2@buisco.co.uk", department);
		Employee employee2 = new Employee("Christopher Christopher Christopher",49, 1, "christopherchristopher@buisco.co.uk", department);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

		Project project = new Project("Digital Transformation", 250);
		projectRepository.save(project);
		project.addEmployee(employee1);
		projectRepository.save(project);

	}

}
