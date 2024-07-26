package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controll {
@GetMapping("/get")
public String get() {
	return "New Docker  Run";
}
}
