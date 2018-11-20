package gui.view;

import javax.swing.*;
import java.awt.Color;
import gui.controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel
{
	private Controller appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;

	public FirstPanel(Controller appController)
	{
		super();
		this.appController = appController;

		myButton = new JButton("Click");
		myLabel = new JLabel("This is a Label.");
		appLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.add(myButton);
		this.add(myLabel);
		this.setLayout(appLayout);
	}

	private void setupLayout()
	{

	}

	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		this.setBackground(new Color(red, green, blue));

	}

	private void setupListeners()
	{
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeColor();
			}
		});
	}
}
