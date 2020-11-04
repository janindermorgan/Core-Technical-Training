package com.hsbc.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.Entities.College;
import com.hsbc.Repos.CollegeRepo;
import java.util.Optional;
@RestController
public class FirstController {
	
	@Autowired
	CollegeRepo repoRef;
	
	@GetMapping("/showall")
	public List<College> showall();
		return repoRef.findAll();
	
	@GetMapping("/showbyname/{name}")
	public List<College> showbyname(@PathVariable("name") String name){
		return repoRef.findByName(name);	
	}
	
	
	@PostMapping("/RecordEntry")
	public String RecordInsert(@RequestBody College ref) {
		Optional<College> optref=repoRef.findById(ref.getRegno());
		if(optref.isPresent()) { 
			return "Regno taken";
			
		}
		else {
			repoRef.save(ref);
			return "record saved";	
		}
	}
	
	@GetMapping("/showrecord/{regno}")
	public College showRecord(@PathVariable("regno") int R) {
		
		College student=null;;
		Optional<College> optref=repoRef.findById(R);
		if(optref.isPresent()) { 
			student=optref.get();
			
		}
		else {
			repoRef.save(student);
		}
		return student;
	}
	
	@GetMapping("/saverecord")
	public String saveRecord() {
		
		College student = new College();
		
		student.setRegno(101);
		student.setName("Shafeeq");
		student.setMarks(103);
		
		repoRef.save(student);
		return "records saved";
	}
}
