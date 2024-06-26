package com.cdp;

public class Test {
	public static void main(String[] args) {
		TelevisionReceiver tv = new TelevisionReceiver();
		RemoteControl_Invoker invoker = new RemoteControl_Invoker();
		// RemoteControl_Invoker invoker = new RemoteControl_Invoker(new
		// PowerOffCmd(tv));
		ICommand onCmd = new PowerOnCmd(tv);
		ICommand offCmd = new PowerOffCmd(tv);

		invoker.pressButton(onCmd);
		invoker.pressButton(offCmd);
		System.out.println("--------------------------");
		invoker.undoButton();
	}
}
