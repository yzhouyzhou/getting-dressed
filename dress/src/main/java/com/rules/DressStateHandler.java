package com.rules;

public class DressStateHandler {
	private static boolean isStopped = false;
	private static boolean isHatOn = false;
	private static boolean isPantsOn = false;
	private static boolean isShirtOn = false;
	private static boolean isShoesOn = false;
	private static boolean isSocksOn = false;
	private static boolean isDressed = false;
	private static boolean isLeaveRequested = false;
	private static boolean status = false;

	private DressStateHandler() {
		super();
	}

	private static DressStateHandler instance = null;

	public static DressStateHandler getInstance() {
		if (instance == null) {
			instance = new DressStateHandler();
		}
		return instance;
	}

	public void reset() {
		isStopped = false;
		isHatOn = false;
		isPantsOn = false;
		isShirtOn = false;
		isShoesOn = false;
		isSocksOn = false;
		isDressed = false;
		isLeaveRequested = false;
		status = false;
	}

	private void checkDressedStatus() {
		isDressed = isPantsOn && isShirtOn && isShoesOn && isSocksOn;
	}

	public boolean getStatus() {
		checkDressedStatus();
		StringBuilder s = new StringBuilder();
		s.append(isDressed ? " | Dressed Up" : " | fail");
		status = isDressed && isLeaveRequested;
		s.append(status ? " and Leave == >>" : " ");
		System.out.println(s);
		return status;
	}

	public boolean getHatOn() {
		return isHatOn;
	}

	public boolean getPantsOn() {
		return isPantsOn;
	}

	public boolean getShirtOn() {
		return isShirtOn;
	}

	public boolean getShoesOn() {
		return isShoesOn;
	}

	public boolean getSocksOn() {
		return isSocksOn;
	}

	public void setHatOn() {
		isHatOn = true;
	}

	public void setLeaveRequested() {
		isLeaveRequested = true;
	}

	public void setPantsOn() {
		isPantsOn = true;
	}

	public void setShirtOn() {
		isShirtOn = true;
	}

	public void setShoesOn() {
		isShoesOn = true;
	}

	public void setSocksOn() {
		isSocksOn = true;
	}

	public boolean isStopped() {
		return isStopped;
	}

	public void setStopped() {
		isStopped = true;
	}
}
