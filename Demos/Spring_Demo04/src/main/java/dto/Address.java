package dto;

import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class Address {

	int no;
	String street;
	String city, state;
	@Max(99999)
	@Min(10000)
	int zipCode;

}