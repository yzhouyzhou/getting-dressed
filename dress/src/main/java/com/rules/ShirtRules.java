package com.rules;

public class ShirtRules extends DressedRules {
	private final String myName = "SHIRT";

	public ShirtRules(int num) {
		super();
		setRules();
	}

	public String myName() {
		return myName;
	}

	public void setRules() {
		super.setRules();
		if (!DressStateHandler.getInstance().getHatOn()) {
			DressStateHandler.getInstance().setShirtOn();
		} else {
			DressStateHandler.getInstance().setStopped();
		}
	}
}
