package co.brbravo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.brbravo.dto.DtoEmployee;
import co.brbravo.mapper.EmployeeMapper;
import co.brbravo.models.Employee;
import co.brbravo.repository.EmployeeRepo;
import co.brbravo.services.EmployeeSrv;

@Service
public class EmployeeSrvImpl implements EmployeeSrv {

	@Autowired
	private EmployeeRepo EMPLOYEE;
	
	@Override
	public DtoEmployee addEmployee(DtoEmployee employee) {
		if(employee != null) {
			Employee emp = EMPLOYEE.save(EmployeeMapper.dtoEmployeeToEmployee(employee));
			return EmployeeMapper.employeeToDtoEmployee(emp);
		}
		return new DtoEmployee();
	}

	@Override
	public List<DtoEmployee> listEmployeeByRole(String role) {
		if(!role.isBlank()) {
			return EMPLOYEE.findAllByRole(role).stream().map(employee -> EmployeeMapper.employeeToDtoEmployee(employee)).collect(Collectors.toList());
		}
		return new ArrayList<>();
	}

}
