package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
@Autowired
	DepartmentRepository departmentRepo;
	
	public Department saveDepartment(Department department) {
			return departmentRepo.save(department);
	}
	
	
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepo.findAll();
	}
	

	public void deleteDepartmentById(Long did) {
		// TODO Auto-generated method stub
		 departmentRepo.deleteById(did);
	}

}
