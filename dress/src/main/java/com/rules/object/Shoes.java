package com.rules.object;

import com.rules.DressStates;

public class Shoes extends DressedRules {
	private final String myName = "SHOES";

	public Shoes(int num) {
		super();
	}

	@Override
	public String myName() {
		return myName;
	}

	@Override
	public void setRules() {
		super.setRules();
		if (DressStates.getInstance().getSocksOn() && DressStates.getInstance().getPantsOn()) {
			DressStates.getInstance().setShoesOn();
		} else {
			DressStates.getInstance().setStopped();
		}
	}
}
