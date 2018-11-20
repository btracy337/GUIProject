package gui.controller;

import gui.model.Human;
import gui.view.FirstFrame;

public class Controller
{
	private Human myHuman;
	private FirstFrame appFrame;

	public void start()
	{

	}

	public Controller()
	{
		Human myHuman = new Human();
		FirstFrame appFrame = new FirstFrame(this);
	}
}
