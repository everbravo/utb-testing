package co.brbravo.services;

import java.util.List;

import co.brbravo.dto.DtoEmployee;

public interface EmployeeSrv {
	public DtoEmployee addEmployee(DtoEmployee employee);
	public List<DtoEmployee> listEmployeeByRole(String role);
}
