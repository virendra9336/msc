package com.msc.app.msc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.ResponseEntity;

import com.google.gson.Gson;
import com.msc.app.msc.model.entity.Employee;
import com.msc.app.msc.model.form.EmployeeVo;

public class Mapper {
	static SimpleDateFormat  formatter = new SimpleDateFormat("yyyy-MM-dd");
	static Gson gson = new Gson();
	public static Employee converFormVoToEntity(EmployeeVo employeeVo ) {
		System.out.println(employeeVo.getName());
		String json = gson.toJson(employeeVo);
		
		Employee employee = null;
		try {
		employee=	gson.fromJson(json, Employee.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	public static EmployeeVo converEntityToFormVo(Object result) {
		String json = gson.toJson(result);
		
		EmployeeVo employee = null;
		try {
		employee=	gson.fromJson(json, EmployeeVo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	

}
