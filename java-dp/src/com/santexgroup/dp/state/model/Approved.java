package com.santexgroup.dp.state.model;

public class Approved implements State {

	@Override
	public void handle() {
		System.out.println("The Loan is approved");
	}

}
