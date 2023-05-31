package com.train.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;



import com.train.dao.EmployeeDao;
import com.train.model.Employee;

public class EmpControllerDB implements EmployeeInterface{
	
	Scanner sc = new Scanner(System.in);
	//Employee emp = new Employee();	
	Employee emp;  
	List<Employee> emplist	= new ArrayList<>();
	EmployeeDao empdao = new EmployeeDao();
	
	
	public void addEmployee()
	{
		emp = new Employee();
		
		System.out.println("Enter Eno");
		int eno =sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("Enter Ename");
		String ename =sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		
		empdao.insertEmployee(emp);
		
		System.out.println("Employee Added Successfully");
		
	}
	
	public void updateEmployee()
	{
		emp = new Employee();
		
		System.out.println("Enter Name to Change");
		String ename = sc.next();
		emp.setEname(ename);
		
		//int eno =sc.nextInt();
		//emp.setEmpno(eno);
		
		System.out.println("Enter Employee number of the Employee name to be Changed : ");
		int eno = sc.nextInt();
		emp.setEmpno(eno);
		
		//String ename =sc.next();
		//emp.setEname(ename);
		
		emplist.add(emp) ;  //add(emp);		
		empdao.updateEmployee(emp);
		
		System.out.println("Employee Updated Successfully");
		
	}
	
	public void deleteEmployee()
	{
		emp = new Employee();
		
		
		System.out.println("Enter Employee number To be Deleted : ");
		int eno = sc.nextInt();
		emp.setEmpno(eno);
				
		emplist.add(emp) ;  //add(emp);
		
		empdao.deleteEmployee(emp);
		
		System.out.println("Employee Deleted Successfully");
	}
	public void viewEmployee() {
		//System.out.println(emp.getEmpno());
		//System.out.println(emp.getEname());	
		
		System.out.println("From Obj = "+emp);
		System.out.println("From List = "+ emplist);
		//System.out.println(emp);
		Iterator<Employee> i = emplist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Data From DB using View : ");
		
		empdao.showEmployee();
	}
}
