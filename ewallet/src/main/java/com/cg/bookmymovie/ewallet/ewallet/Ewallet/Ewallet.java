package com.cg.bookmymovie.ewallet.ewallet.Ewallet;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Ewallet {

	private Integer profileId;
	private Double currentBalance;

	@ElementCollection
	private Set<Statement> statement;

	public Ewallet(Integer profileId, Double currentBalance, Set<Statement> statement) {
		super();
		this.profileId = profileId;
		this.currentBalance = currentBalance;
		this.statement = statement;
	}

	public Ewallet() {
		// TODO Auto-generated constructor stub
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Set<Statement> getStatement() {
		return statement;
	}

	public void setStatement(Set<Statement> statement) {
		this.statement = statement;
	}

	@Override
	public String toString() {
		return "Ewallet [profileId=" + profileId + ", currentBalance=" + currentBalance + ", statement=" + statement
				+ "]";
	}

}
