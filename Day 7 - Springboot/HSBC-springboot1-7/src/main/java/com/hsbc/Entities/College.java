package com.hsbc.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int regno;
	private int marks;
	private String name;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
