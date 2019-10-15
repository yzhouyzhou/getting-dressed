package com.rules.command;

import com.rules.object.Hats;

public class HatsOnCommand implements Command {
	private Hats theHats;

	public HatsOnCommand(Hats h) {
		theHats = h;
	}

	@Override
	public void execute() {
		theHats.setRules();
	}
}
