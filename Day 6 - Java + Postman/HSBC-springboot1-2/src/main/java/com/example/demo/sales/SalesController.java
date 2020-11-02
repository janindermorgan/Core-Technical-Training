package com.example.demo.sales;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {

		@GetMapping("/hsbc/sales")
		public String sales() {
			return "Welcome to Sales";
		}
		
}
