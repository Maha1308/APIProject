//Controller.java
package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.Service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	@PostMapping("/departments/")
	public Department saveDepatDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	//getRecords
	@GetMapping("/departments/")
	public List<Department> fetchDepartmetList(){
		
		return departmentService.fetchDepartmentList();
	}
	
	//delete 
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long did) {
		departmentService.deleteDepartmentById(did);
		return "Department is deleted";
		
	}
	
}
