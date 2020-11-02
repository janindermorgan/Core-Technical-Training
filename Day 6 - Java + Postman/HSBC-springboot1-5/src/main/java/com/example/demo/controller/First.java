package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.utilities.Records;

@RestController
public class First {
	@Autowired
	Records ref;
	
	@GetMapping("/showrecords")
	public ArrayList<String> displayallrecords(){
		return ref.showEmployees();
	}
	
	@GetMapping("/addrecord/{name}")
	public String addingRecord(@PathVariable("name") String name) {
		ref.addRecord(name);
		return "Record Stored";
		
	}
	@GetMapping("/removerecord/{reno}")
	public String removeRecord(@PathVariable("reno") String reno) {
		ref.addRecord(reno);
		return "Record Deleted";
	}
	
}
