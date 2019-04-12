package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	int employeeId, roleId;
	String username, password, firstName, lastName, email;

	@Override
	public String toString() {
		return "User: { ID: " + this.employeeId + " Username: " + this.username + " First: " + this.firstName
				+ " Last: " + this.lastName + " Email: " + this.email + " RoleID: " + this.roleId + " }";
	}
}
