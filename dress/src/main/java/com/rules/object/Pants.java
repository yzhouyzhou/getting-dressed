package com.rules.object;

import com.rules.DressStates;

public class Pants extends DressedRules {
	private final String myName = "PANTS";

	public Pants(int num) {
		super();
	}

	@Override
	public String myName() {
		return myName;
	}

	@Override
	public void setRules() {
		super.setRules();
		if (!DressStates.getInstance().getShoesOn()) {
			DressStates.getInstance().setPantsOn();
		} else {
			DressStates.getInstance().setStopped();
		}
	}
}
