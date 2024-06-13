package com.alok;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService empService;

	@Autowired
	EmpValidator empValidator;

	@InitBinder("emp")
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(empValidator);
	}

	@PostMapping
	public ResponseEntity<Emp> addEmp(@RequestBody @Valid Emp emp) {

		return new ResponseEntity<>(empService.addEmp(emp), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Emp> getEmp() {
		return Arrays.asList(new Emp(1, "Alok Bande", 16, "permanent"), new Emp(2, "Pranshi Bande", 20, "permanent"));
	}
}
