package co.brbravo.mapper;

import co.brbravo.dto.DtoEmployee;
import co.brbravo.models.Employee;

public class EmployeeMapper {

	public static Employee dtoEmployeeToEmployee(DtoEmployee employeDto) {
		Employee employee = new Employee();
		employee.setDocument(employeDto.getDocument());
		employee.setName(employeDto.getName());
		employee.setLastName(employeDto.getLastName());
		employee.setRole(employeDto.getRole());
		employee.setBirthday(employeDto.getBirthday());
		
		return employee;
	}

	
	public static DtoEmployee employeeToDtoEmployee(Employee employe) {
		
		DtoEmployee employeeDto = new DtoEmployee();
		employeeDto.setId(employe.getId());
		employeeDto.setDocument(employe.getDocument());
		employeeDto.setName(employe.getName());
		employeeDto.setLastName(employe.getLastName());
		employeeDto.setRole(employe.getRole());
		employeeDto.setBirthday(employe.getBirthday());
		
		return employeeDto;
	}

}
