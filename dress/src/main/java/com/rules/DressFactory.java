package com.rules;

import com.rules.command.Command;
import com.rules.command.HatsOnCommand;
import com.rules.command.LeaveCommand;
import com.rules.command.NoRulesCommand;
import com.rules.command.PantsOnCommand;
import com.rules.command.ShirtOnCommand;
import com.rules.command.ShoesOnCommand;
import com.rules.command.SocksOnCommand;
import com.rules.object.Hats;
import com.rules.object.IDress;
import com.rules.object.Leave;
import com.rules.object.NoRules;
import com.rules.object.Pants;
import com.rules.object.Shirt;
import com.rules.object.Shoes;
import com.rules.object.Socks;

public class DressFactory {
	
	private DressFactory() {
		super();
	}

	static public Command getInstance(int id) {
		switch (id) {
		case IDress.HAT:
			return new HatsOnCommand(new Hats(id));
		case IDress.PANTS:
			return new PantsOnCommand(new Pants(id));
		case IDress.SHIRT:
			return new ShirtOnCommand(new Shirt(id));
		case IDress.SHOES:
			return new ShoesOnCommand(new Shoes(id));
		case IDress.SOCKS:
			return new SocksOnCommand(new Socks(id));
		case IDress.LEAVE:
			return new LeaveCommand(new Leave(id));
		default:
			return new NoRulesCommand(new NoRules(id));
		}
	}
}
