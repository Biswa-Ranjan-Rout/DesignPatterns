package com.cmd.textEditor;

public class InserTextCommand implements ICommand{
	
	private TextEditor textEditor;
	private String text;
	private int position;

	public InserTextCommand(TextEditor textEditor, String text, int position) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
