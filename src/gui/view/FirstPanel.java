package gui.view;
import javax.swing.*;
import gui.controller.Controller;

public class FirstPanel extends JPanel
{
	private Controller appController;
	private JButton myButton;
	private JLabel myLabel;
	public FirstPanel(Controller appController)
	{
		super();
		this.appController = appController;
		
		myButton = new JButton("Click");
		myLabel = new JLabel("This is a Label.");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.add(myButton);
		this.add(myLabel);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
		
	}

}
