package com.example.demo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController extends StudentRecords {
	@Autowired
	StudentRecords sturef;
	
	@GetMapping("/showallstudents")
	public ArrayList<Student> showstudents(){
		return sturef.showStudents();
	}
	@GetMapping("saverecord/{regno}/{name}/{marks}")
	public String saverrecord(@PathVariable("regno") int regno1, @PathVariable("name") String name1, @PathVariable("marks") int marks1) {
		Student ref=new Student();
		ref.regno=regno1;
		ref.name=name1;
		ref.marks=marks1;
		
		sturef.addrecord(ref);
		return "Record Saved";
				
	}
	@GetMapping("/showrecord/{student}")
	public int showrecord(@PathVariable("student") int a) {
		String stra="";
		stra= Integer.toString(a);
		String student= (String) employees.get(a);
	}
}
