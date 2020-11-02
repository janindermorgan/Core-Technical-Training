package com.example.demo.TaxCalculator;

import org.springframework.stereotype.Service;

//Write Calculations in seperate class to controller
@Service
public class TaxCalculator {
	public double taxcalculator (double salary){
	double tax=0;
	if(salary>=2000) {
		tax = 0.25;
		tax =  tax*salary;
	}
	else {
		if(1000<=salary & salary<2000) {
		tax=0.15;
		tax= tax*salary;
		}
		else {
		tax=0.1;
		tax= tax*salary;
		}
	}
	return tax;
}
}
