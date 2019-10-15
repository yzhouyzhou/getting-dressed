package com.rules;

public class Hats extends DressedRules {
	private final String myName = "HATS";

	public Hats(int num) {
		super();
		setRules();
	}

	public String myName() {
		return myName;
	}

	public void setRules() {
		super.setRules();
		if (DressStateHandler.getInstance().getShirtOn()) {
			DressStateHandler.getInstance().setHatOn();
		} else {
			DressStateHandler.getInstance().setStopped();
		}
	}
}
