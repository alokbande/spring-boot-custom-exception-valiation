package com.alok;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

	private int id;
	@NotBlank(message = "please enter name")
	@NotEmpty(message = "Name connot be empty")
	private String name;

	@Min(5)
	@Max(75)
	private int age;
	
	//custom annotation
    @ValidateEmployeeType
    private String employeeType; //permanent or vendor or contractual
    

}
