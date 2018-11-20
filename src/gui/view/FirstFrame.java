package gui.view;

import javax.swing.JFrame;
import gui.controller.Controller;

public class FirstFrame extends JFrame

{
	private FirstPanel appPanel;
	private Controller appController;
public FirstFrame(Controller appController)
{
	super();	
	this.appController = appController;
	this.appPanel = new FirstPanel(appController);
	
	setupFrame();
}

private void setupFrame()
{
	this.setContentPane(appPanel);
	this.setSize(800, 800);
	this.setTitle("My GUI");
	this.setResizable(true);
	this.setVisible(true);
}
}
