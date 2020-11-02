package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

		@GetMapping("/hsbc/accounts")
		public String accounts() {
			return "Welcome to Accounts";
		}
		
}
