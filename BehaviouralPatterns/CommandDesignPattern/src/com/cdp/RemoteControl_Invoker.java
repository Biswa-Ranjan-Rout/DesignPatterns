package com.cdp;

import java.util.Stack;

public class RemoteControl_Invoker {
	
	Stack<ICommand> stack = new Stack<>();
/*
	private ICommand cmd;
	
	public RemoteControl_Invoker(ICommand cmd) {
		this.cmd = cmd;
	}
*/
	
	public void pressButton(ICommand cmd) {
		cmd.execute();
		stack.push(cmd);
	}

	public void undoButton() {
		if (!stack.isEmpty()) {
			ICommand lastCmd = stack.pop();
			lastCmd.undo();
		}
	}
}