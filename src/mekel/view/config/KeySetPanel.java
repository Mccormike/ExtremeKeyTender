package mekel.view.config;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class KeySetPanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private GridLayout layout;
	
	public KeySetPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Config
		 */
		this.setBackground(Color.WHITE);
		layout = new GridLayout(0,1,5,5);
		this.setLayout(layout);
	}
}
