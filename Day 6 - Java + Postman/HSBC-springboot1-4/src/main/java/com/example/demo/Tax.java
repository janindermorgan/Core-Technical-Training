package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TaxCalculator.TaxCalculator;
@RestController
public class Tax {
	
	@Autowired
	TaxCalculator ref;
	//TaxCalculator ref = new TaxCalculator();

	@GetMapping("/taxcalculation/{salary}")
	public String Whatever(@PathVariable("salary") int B){
		return "Your tax is: " + ref.taxcalculator(B);
	}	
}

