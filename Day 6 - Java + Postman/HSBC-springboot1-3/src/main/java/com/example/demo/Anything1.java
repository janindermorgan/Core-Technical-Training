package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Anything1 {

		@GetMapping("/info/{names}/{Address}")
		public String Whatever(@PathVariable("names") String B, @PathVariable("Address") String A){
			return B + ", you live in "+ A;
		}
		
}
