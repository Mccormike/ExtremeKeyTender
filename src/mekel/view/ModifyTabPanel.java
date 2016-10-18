package mekel.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class ModifyTabPanel extends JPanel{

	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JScrollPane pane;
	
	public ModifyTabPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Config
		 */
		this.setBackground(Color.WHITE);
		this.setBorder(new EmptyBorder(5,5,5,5));
		this.setLayout(new BorderLayout(20,10));
		
		pane = new JScrollPane();
		this.add(pane, BorderLayout.CENTER);
	}
}
