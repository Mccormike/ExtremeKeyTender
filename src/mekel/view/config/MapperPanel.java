package mekel.view.config;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import mekel.util.Constants;

public class MapperPanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JLabel gameLbl;
	
	private BorderLayout layout;
	
	public MapperPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Config
		 */
		
		layout = new BorderLayout(0,0);
		this.setBackground(Color.WHITE);
		this.setLayout(layout);
		
		gameLbl = new JLabel();
		gameLbl.setFont(new Font(Constants.FONT_NAME, Font.BOLD, 16));
		this.add(gameLbl, BorderLayout.NORTH);
	}

	public JLabel getGameLbl() {
		return gameLbl;
	}

	public void setGameLbl(JLabel gameLbl) {
		this.gameLbl = gameLbl;
	}

	public BorderLayout getLayout() {
		return layout;
	}

	public void setLayout(BorderLayout layout) {
		this.layout = layout;
	}
	
	
}
