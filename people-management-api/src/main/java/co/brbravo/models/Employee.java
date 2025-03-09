package co.brbravo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private Long Id;
	
	@Column(name = "employee_document", length = 80, nullable = false)
	private String document;
	
	@Column(name = "employee_name", length = 80, nullable = false)
	private String name;
	
	@Column(name = "employee_last_name", length = 100, nullable = false)
	private String lastName;
	
	@Column(name = "employee_role", length = 1, nullable = false)
	private String role;
	
	@Column(name = "fecha_nacimiento", nullable = true)
	private String birthday;

}
