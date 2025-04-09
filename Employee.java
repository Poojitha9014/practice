package com.drk.learning;

public class Employee {
	
	int eno;
	String name;
	int sal;
	public Employee(int eno, String name, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
