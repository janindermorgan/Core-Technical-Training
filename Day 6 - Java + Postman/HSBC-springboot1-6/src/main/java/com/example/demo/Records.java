package com.example.demo;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class Records {
	ArrayList<String> employees=new ArrayList<String>();
	
	public Records() {
		employees.add("shafeeq");
		employees.add("Ali");
		employees.add("Janinder");
		employees.add("Max");
	}
	public ArrayList<String> showEmployees(){
		return employees;
	}
	public void addRecord(String name) {
		employees.add(name);
	}
	public void removeRecord(int reno) {
		employees.remove(reno);
	
	}
}
