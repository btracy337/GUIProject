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
	myHuman = new Human();
	appFrame = new FirstFrame();
}
}
