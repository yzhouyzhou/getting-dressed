package com.rules.command;

import com.rules.object.Pants;

public class PantsOnCommand implements Command {
	private Pants thePants;
	
	public PantsOnCommand (Pants p){
		thePants = p;
	}
	@Override
	public void execute() {
		thePants.setRules();
	}
}
