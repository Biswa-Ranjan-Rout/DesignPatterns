package com.cdp;

public class PowerOffCmd implements ICommand {
	private TelevisionReceiver tv;

	public PowerOffCmd(TelevisionReceiver tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.powerOff();
	}

	@Override
	public void undo() {
		tv.powerOn();
	}

}
