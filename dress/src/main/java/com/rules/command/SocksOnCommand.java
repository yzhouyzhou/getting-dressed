package com.rules.command;

import com.rules.object.Socks;

public class SocksOnCommand implements Command {
	private Socks theSocks;

	public SocksOnCommand(Socks s) {
		theSocks = s;
	}

	@Override
	public void execute() {
		theSocks.setRules();
	}
}
