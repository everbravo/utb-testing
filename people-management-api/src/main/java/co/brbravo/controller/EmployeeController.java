package co.brbravo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.brbravo.dto.DtoEmployee;
import co.brbravo.services.impl.EmployeeSrvImpl;

@RestController
@RequestMapping("employees/v0")
public class EmployeeController {
	
	@Autowired
	private EmployeeSrvImpl EMPLOYEESRVIMPL;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<DtoEmployee> addEmployees(@RequestBody DtoEmployee employee ){
		return new ResponseEntity<>(EMPLOYEESRVIMPL.addEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping("/listEmployee/{role}")
	public ResponseEntity<List<DtoEmployee>> addEmployees(@PathVariable("role") String role ){
		return new ResponseEntity<>(EMPLOYEESRVIMPL.listEmployeeByRole(role), HttpStatus.OK);
	}
}
