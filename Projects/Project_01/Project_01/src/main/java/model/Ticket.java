package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	int reimbId, reimbAmount, reimbAuthId, reimbResolvId, reimbStatusId, reimbTypeId;
	String reimbSubTime, reimbResTime, reimbDesc;

	@Override
	public String toString() {
		return "Ticket: { ID: " + this.reimbId + " Amount: " + this.reimbAmount + " Auth: " + this.reimbAuthId
				+ " Resolver: " + this.reimbResolvId + " Status: " + this.reimbStatusId + " Reimb Type: "
				+ this.reimbTypeId + "Submitted: " + this.reimbSubTime + "Resolved: " + this.reimbResolvId
				+ "Description: " + this.reimbDesc + " }";
	}
}
