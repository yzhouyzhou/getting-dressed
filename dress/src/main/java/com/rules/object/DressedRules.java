package com.rules.object;

import com.rules.DressStates;

abstract class DressedRules implements IDress {
	abstract public String myName();

	@Override
	public void setRules() {
		if (DressStates.getInstance().isStopped())
			return;
		System.out.print(myName() + " ");
	};
}
