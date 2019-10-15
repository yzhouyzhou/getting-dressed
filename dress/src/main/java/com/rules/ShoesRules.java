package com.rules;

public class ShoesRules extends DressedRules {
	private final String myName = "SHOES";

	public ShoesRules(int num) {
		super();
		setRules();
	}

	public String myName() {
		return myName;
	}

	public void setRules() {
		super.setRules();
		if (DressStateHandler.getInstance().getSocksOn() && DressStateHandler.getInstance().getPantsOn()) {
			DressStateHandler.getInstance().setShoesOn();
		} else {
			DressStateHandler.getInstance().setStopped();
		}
	}
}
