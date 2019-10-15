package com.rules;

public class LeaveRules extends DressedRules {
	private final String myName = "LEAVE";

	public LeaveRules(int num) {
		super();
		setRules();
	}

	public String myName() {
		return myName;
	}

	public void setRules() {
		super.setRules();
		DressStateHandler.getInstance().setLeaveRequested();
	}
}
