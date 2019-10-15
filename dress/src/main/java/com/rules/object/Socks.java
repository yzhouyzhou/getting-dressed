package com.rules.object;

import com.rules.DressStates;

public class Socks extends DressedRules {
	private final String myName = "SOCKS";

	public Socks(int num) {
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
			DressStates.getInstance().setSocksOn();
		} else {
			DressStates.getInstance().setStopped();
		}
	}
}
