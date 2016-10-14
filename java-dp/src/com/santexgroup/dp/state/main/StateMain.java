package com.santexgroup.dp.state.main;

import com.santexgroup.dp.state.model.Approved;
import com.santexgroup.dp.state.model.Loan;
import com.santexgroup.dp.state.model.PreApproved;
import com.santexgroup.dp.state.model.Requested;

public class StateMain {
	
	public static void main(String[] args) {
		Loan loan = new Loan();
		
		loan.setState(new Requested());
		loan.request();
		
		loan.setState(new PreApproved());
		loan.request();
		
		loan.setState(new Approved());
		loan.request();
	}

}
