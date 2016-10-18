package mekel.view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class GameSelectPanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;
		
	public GameSelectPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Specific panel configs.
		 */
		this.setBackground(Color.WHITE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
}
