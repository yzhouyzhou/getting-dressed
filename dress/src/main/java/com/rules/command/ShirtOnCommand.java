package com.rules.command;

import com.rules.object.Shirt;

public class ShirtOnCommand implements Command {
	private Shirt theShirt;

	public ShirtOnCommand(Shirt h) {
		theShirt = h;
	}

	@Override
	public void execute() {
		theShirt.setRules();
	}
}
