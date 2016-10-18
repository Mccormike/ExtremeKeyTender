package mekel.view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CustomizeTabPanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JLabel constructLbl;
	
	public CustomizeTabPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setLayout(new BorderLayout(0, 0));
		
		constructLbl = new JLabel("Under Construction");
		constructLbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		constructLbl.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(constructLbl, BorderLayout.CENTER);
	}
}
