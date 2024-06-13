package com.alok;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class EmpValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Emp.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Emp emp = (Emp) target;
		if (emp.getName().length() < 3) {
			errors.rejectValue("Name", "Name should contain more 3 char");
		}
	}

}
