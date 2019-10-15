package com.rules.object;

import com.rules.DressStates;

public class Leave extends DressedRules {
	private final String myName = "LEAVE";

	public Leave(int num) {
		super();
	}

	@Override
	public String myName() {
		return myName;
	}

	@Override
	public void setRules() {
		super.setRules();
		DressStates.getInstance().setLeaveRequested();
	}
}
