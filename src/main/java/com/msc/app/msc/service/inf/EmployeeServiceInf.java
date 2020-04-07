package com.msc.app.msc.service.inf;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.msc.app.msc.model.entity.Employee;
import com.msc.app.msc.utils.ResponseBean;

public interface EmployeeServiceInf {
	
	ResponseEntity<ResponseBean> save(Employee employee);

	ResponseEntity<ResponseBean> getAll();
	
	Object deleteById(long id);

	List<Employee> findByNameAndAddress(String name,String address);
	
	ResponseEntity<ResponseBean> findById(long id);
}
