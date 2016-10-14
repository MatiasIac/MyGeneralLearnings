package com.santexgroup.dp.state.model;

public class Loan {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void request() {
		this.state.handle();
	}

}
