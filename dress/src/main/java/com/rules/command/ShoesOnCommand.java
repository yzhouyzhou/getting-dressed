package com.rules.command;

import com.rules.object.Shoes;

public class ShoesOnCommand implements Command {
	private Shoes theShoes;

	public ShoesOnCommand(Shoes h) {
		theShoes = h;
	}

	@Override
	public void execute() {
		theShoes.setRules();
	}
}
