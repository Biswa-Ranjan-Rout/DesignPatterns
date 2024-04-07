package com.cdp;

public class PowerOnCmd implements ICommand {
	private TelevisionReceiver tv;

	public PowerOnCmd(TelevisionReceiver tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.powerOn();
	}

	@Override
	public void undo() {
		tv.powerOff();
	}
}
