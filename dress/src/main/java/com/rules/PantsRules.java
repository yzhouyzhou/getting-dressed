package com.rules;

public class PantsRules extends DressedRules {
	private final String myName = "PANTS";

	public PantsRules(int num) {
		super();
		setRules();
	}

	public String myName() {
		return myName;
	}

	public void setRules() {
		super.setRules();
		if (!DressStateHandler.getInstance().getShoesOn()) {
			DressStateHandler.getInstance().setPantsOn();
		} else {
			DressStateHandler.getInstance().setStopped();
		}
	}
}
