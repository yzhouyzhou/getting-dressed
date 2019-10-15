package com.rules.command;

import com.rules.object.NoRules;

public class NoRulesCommand implements Command {
	private NoRules theNoRules;

	public NoRulesCommand(NoRules n) {
		theNoRules = n;
	}

	@Override
	public void execute() {
		theNoRules.setRules();
	}
}
