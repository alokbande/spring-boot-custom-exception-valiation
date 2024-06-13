package com.alok;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class EmpService {

	public Emp addEmp(Emp emp) {
		emp.setId(new Random().nextInt());
		return emp;
	}
}
