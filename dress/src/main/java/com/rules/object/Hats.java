package com.rules.object;

import com.rules.DressStates;

public class Hats extends DressedRules {
	private final String myName = "HATS";

	public Hats(int num) {
		super();
	}

	@Override
	public String myName() {
		return myName;
	}

	@Override
	public void setRules() {
		super.setRules();
		if (DressStates.getInstance().getShirtOn()) {
			DressStates.getInstance().setHatOn();
		} else {
			DressStates.getInstance().setStopped();
		}
	}
}
