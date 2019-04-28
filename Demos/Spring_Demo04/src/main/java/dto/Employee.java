package dto;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Employee {

	@GeneratedValue
	@Id
	int id;
	@NotNull
	@Column(nullable = false)
	@Size(min = 3, max = 30)
	String name;
	@Embedded
	@NotNull
	Address adr;

}