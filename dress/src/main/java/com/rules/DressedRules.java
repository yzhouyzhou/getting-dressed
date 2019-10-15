package com.rules;

abstract class DressedRules implements IRules {
	abstract public String myName();

	public void setRules() {
		if (DressStateHandler.getInstance().isStopped())
			return;
		System.out.print(myName() + " ");
	};
}
