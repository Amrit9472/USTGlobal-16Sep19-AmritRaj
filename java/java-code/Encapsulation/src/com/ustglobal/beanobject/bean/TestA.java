package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("Amrit");
		s.setRollNo(533);
		
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(12);
		e.setName("Ayushi");
		e.setSalary(200);
		
		DatabaseEmp d= new DatabaseEmp();
		d.receive(e);
		
	}
	
	  

}
