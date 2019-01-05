package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.dao.emp.EmployeeResponse;
import com.dao.emp.Message;

public class EmployeeDao {
public List<EmployeeResponse> getEmployees() {

	List<EmployeeResponse> responses = new ArrayList<EmployeeResponse>();

	EmployeeResponse response = new EmployeeResponse();
	response.setEmpId(1);
	response.setEmpName("Sudarshan");
	response.setEmpDept("PD");
	response.setEmpSkill("Java");
	response.setMessage(new Message("Successfully don!!", Boolean.TRUE, "NA"));

	EmployeeResponse response2 = new EmployeeResponse();
	response2.setEmpId(2);
	response2.setEmpName("Admin");
	response2.setEmpDept("IT");
	response2.setEmpSkill("IT");
	response2.setMessage(new Message("Successfully don!!", Boolean.TRUE, "NA"));

	responses.add(response);
	responses.add(response2);
	return responses;

}
}
