package com.santexgroup.dp.state.model;

public class Requested implements State {

	@Override
	public void handle() {
		System.out.println("The Loan has been received");
	}

}
