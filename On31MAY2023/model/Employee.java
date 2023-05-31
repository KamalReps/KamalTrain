package com.train.model;

public class Employee {
	private int empno;
	private String ename;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno=empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	// Convert Object to Sting use the toString
	
	public String toString() {
		
		return "Employee [empno="+ empno +" , employee Name = " + ename +  " ]";
		
	}
	
}
