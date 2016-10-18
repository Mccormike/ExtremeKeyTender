package mekel.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mekel.util.Constants;

public class GamePanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JLabel iconLabel;
		
	public GamePanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Specific panel configs.
		 */
		this.setPreferredSize(new Dimension(Constants.GP_W, Constants.GP_H));
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		this.setLayout(new BorderLayout(Constants.BL_PAD,0));
		
		iconLabel = new JLabel();
		iconLabel.setPreferredSize(new Dimension(Constants.ICON_D, Constants.ICON_D));
		this.add(iconLabel, BorderLayout.WEST);
	}

	public JLabel getIconLabel() {
		return iconLabel;
	}

	public void setIconLabel(JLabel iconLabel) {
		this.iconLabel = iconLabel;
	}
}
