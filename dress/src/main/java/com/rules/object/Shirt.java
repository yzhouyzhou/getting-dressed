package com.rules.object;

import com.rules.DressStates;

public class Shirt extends DressedRules {
	private final String myName = "SHIRT";

	public Shirt(int num) {
		super();
	}

	@Override
	public String myName() {
		return myName;
	}

	@Override
	public void setRules() {
		super.setRules();
		if (!DressStates.getInstance().getHatOn()) {
			DressStates.getInstance().setShirtOn();
		} else {
			DressStates.getInstance().setStopped();
		}
	}
}
