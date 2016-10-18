package mekel.view;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mekel.util.Constants;

public class GameProfilePanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int H_GAP = 5;
	
	private static final int V_GAP = 15;
		
	private static final int FONT_S = 19;
	
	private Image bg_img;
		
	private JLabel nameLbl;
	
	private JLabel profileLbl;
	
	public GameProfilePanel(Image img) {
		super();
		this.bg_img = img;
		initialize();
	}
	
	private void initialize() {
		
		Dimension size = new Dimension(bg_img.getWidth(null), bg_img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		
		/*
		 * Panel specific configurations.
		 */
		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout(H_GAP, V_GAP));
		/*
		 * Labels
		 */
		nameLbl = new JLabel();
		nameLbl.setFont(new Font(Constants.FONT_NAME, Font.BOLD, FONT_S));
		nameLbl.setForeground(Color.BLACK);
		nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.add(nameLbl, BorderLayout.NORTH);
		
		profileLbl = new JLabel(" " + Constants.PROFILES);
		profileLbl.setForeground(Color.BLACK);
		profileLbl.setFont(new Font(Constants.FONT_NAME, Font.BOLD, FONT_S));
		profileLbl.setHorizontalAlignment(SwingConstants.CENTER);
		profileLbl.setVerticalAlignment(SwingConstants.TOP);
		
		this.add(profileLbl, BorderLayout.WEST);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		float opacity = 0.5f;
		BufferedImage img = new BufferedImage(360, 80, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = img.createGraphics();
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
		g2.drawImage(bg_img, 0, 0, null);
		g2.dispose();
		g.drawImage(img, 0, 0, null);
		
	}

	public JLabel getNameLbl() {
		return nameLbl;
	}

	public void setNameLbl(String name) {
		this.nameLbl.setText(name);;
	}
}
