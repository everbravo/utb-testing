package co.brbravo.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class DtoEmployee implements Serializable{

	private long id;
	private String document;
	private String name;
	private String lastName;
	private String role;
	private String birthday;
	
	private static final long serialVersionUID = 1L;

}
