package mekel.view.config;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import mekel.util.Constants;

public class KeyChangeDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	
	private JLabel label;
	
	public KeyChangeDialog() throws IOException {
		super();
		initialize();
	}
	
	private void initialize() throws IOException {
		this.setTitle("Mapping Key");
		this.setLayout(new BorderLayout(0,0));
		this.setAlwaysOnTop(true);
		this.setModal(true);
		this.setIconImage(ImageIO.read(getClass().getResourceAsStream("/img/monkey.png")));
		this.setBounds(0, 0, 400, 150);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout(0,0));
		panel.setBackground(Color.WHITE);
		
		label = new JLabel();
		label.setFont(new Font(Constants.FONT_NAME, Font.PLAIN, 18));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label, BorderLayout.CENTER);
		
		this.add(panel, BorderLayout.CENTER);
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	
}
