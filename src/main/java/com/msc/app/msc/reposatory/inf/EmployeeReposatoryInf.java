package com.msc.app.msc.reposatory.inf;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.msc.app.msc.model.entity.Employee;
@Repository
public interface EmployeeReposatoryInf  extends CrudRepository<Employee, Long> {

	List<Employee> findByNameAndAddress(String name,String address);
}
