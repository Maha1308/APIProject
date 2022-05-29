package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	void deleteDepartmentById(Long did);


	

	
}
