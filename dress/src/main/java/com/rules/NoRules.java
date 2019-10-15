package com.rules;

public class NoRules extends DressedRules {
	private final String myName = "NORULES";

	public NoRules(int num) {
		super();
		setRules();
	}

	public String myName() {
		return myName;
	}

	public void setRules() {
		super.setRules();
		DressStateHandler.getInstance().setStopped();
	}
}
