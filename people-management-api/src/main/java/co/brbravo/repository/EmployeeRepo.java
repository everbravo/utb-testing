package co.brbravo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.brbravo.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	@Query(value = "select * from employees where employee_role = ?1", nativeQuery = true)
	List<Employee> findAllByRole(String role);

}
