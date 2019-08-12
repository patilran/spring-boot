package com.paramatrix.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public ResponseEntity<Object> testApi(){
		return new ResponseEntity<>("Api is working.....!",HttpStatus.OK);
	}
}
