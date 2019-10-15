package com.rules;

public class SocksRules extends DressedRules {
	private final String myName = "SOCKS";

	public SocksRules(int num) {
		super();
		setRules();
	}

	public String myName() {
		return myName;
	}

	public void setRules() {
		super.setRules();
		if (!DressStateHandler.getInstance().getShoesOn()) {
			DressStateHandler.getInstance().setSocksOn();
		} else {
			DressStateHandler.getInstance().setStopped();
		}
	}
}
