package com.example.demo;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StudentRecords {
	ArrayList<Student> list=new ArrayList<Student>();
	public StudentRecords() {
		Student stu1=new Student();
		stu1.regno=102;
		stu1.name="shafeeq";
		stu1.marks=149;
		list.add(stu1);
	}
	
	public ArrayList<Student> showStudents(){
		return list;
	}
	
	public void addrecord(Student st)	{
		list.add(st);
	}
	public void showrecord(Student stud) {
		return list.get(stud).toString();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==stud) {
				
			}
		}
	}
}	
