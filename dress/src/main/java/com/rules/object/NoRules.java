package com.rules.object;

import com.rules.DressStates;

public class NoRules extends DressedRules {
	private final String myName = "NORULES";

	public NoRules(int num) {
		super();
	}

	@Override
	public String myName() {
		return myName;
	}

	@Override
	public void setRules() {
		super.setRules();
		DressStates.getInstance().setStopped();
	}
}
