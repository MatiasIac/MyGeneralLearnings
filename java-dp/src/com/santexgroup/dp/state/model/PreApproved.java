package com.santexgroup.dp.state.model;

public class PreApproved implements State {

	@Override
	public void handle() {
		System.out.println("The Loan is pre approved");
	}

}
