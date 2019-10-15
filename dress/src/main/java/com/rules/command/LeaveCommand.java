package com.rules.command;

import com.rules.object.Leave;

public class LeaveCommand implements Command {
	private Leave theLeave;

	public LeaveCommand(Leave l) {
		theLeave = l;
	}

	@Override
	public void execute() {
		theLeave.setRules();
	}
}
