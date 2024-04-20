package com.cmd.textEditor;

import java.util.Stack;

public class TextEditor {
	Stack<ICommand> history = new Stack<>();
	Stack<ICommand> redoHistory = new Stack<>();
	String content;

	public TextEditor(String content) {
		this.content = content;
	}

	public void insertText(int position, String text) {
		executeCommand(new InserTextCommand(this, text, position));
	}

	public void deleteText(int start, int end) {

	}

	public void executeCommand(ICommand cmd) {
		cmd.execute();
		history.push(cmd);
		redoHistory.clear();
	}

	public void undo() {
		if (!history.isEmpty()) {
			ICommand cmd = history.pop();
			cmd.undo();
			redoHistory.push(cmd);
		}
	}

	public void redo() {
		if (!redoHistory.isEmpty()) {
			ICommand cmd = redoHistory.pop();
			cmd.execute();
			redoHistory.push(cmd);
		}
	}
}
