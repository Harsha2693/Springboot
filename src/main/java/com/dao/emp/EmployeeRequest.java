package com.dao.emp;

public class EmployeeRequest {

	protected int empId;

	protected String empName;

	protected String empDept;

	protected String empSkill;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpSkill() {
		return empSkill;
	}

	public void setEmpSkill(String empSkill) {
		this.empSkill = empSkill;
	}

}
