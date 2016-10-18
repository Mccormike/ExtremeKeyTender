package mekel.view.config;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mekel.controller.config.ChangeKeyListener;
import mekel.util.Constants;

public class KeyPanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel nameLbl;
	
	private JCheckBox altBox;
	
	private JCheckBox ctrlBox;
	
	private JCheckBox shiftBox;
	
	private JTextField keyField;
	
	private FlowLayout layout;

	public KeyPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Config
		 */
		this.setPreferredSize(new Dimension(400, 50));
		this.setBackground(Color.WHITE);
		layout = new FlowLayout(FlowLayout.LEFT);
		this.setLayout(layout);
		
		nameLbl = new JLabel();
		nameLbl.setPreferredSize(new Dimension(110,30));
		nameLbl.setFont(new Font(Constants.FONT_NAME, Font.PLAIN, 12));
		this.add(nameLbl);
		
		altBox = new JCheckBox("Alt");
		altBox.setBackground(Color.WHITE);
		altBox.setFont(new Font(Constants.FONT_NAME, Font.PLAIN, 12));
		this.add(altBox);
		
		ctrlBox = new JCheckBox("Ctrl");
		ctrlBox.setBackground(Color.WHITE);
		ctrlBox.setFont(new Font(Constants.FONT_NAME, Font.PLAIN, 12));
		this.add(ctrlBox);
		
		shiftBox = new JCheckBox("Shift");
		shiftBox.setBackground(Color.WHITE);
		shiftBox.setFont(new Font(Constants.FONT_NAME, Font.PLAIN, 12));
		this.add(shiftBox);
		
		keyField = new JTextField();
		keyField.setEditable(false);
		keyField.addMouseListener(new ChangeKeyListener());
		keyField.setHorizontalAlignment(JTextField.CENTER);
		keyField.setPreferredSize(new Dimension(80,20));
		this.add(keyField);
	}

	public JLabel getNameLbl() {
		return nameLbl;
	}

	public void setNameLbl(String name) {
		this.nameLbl.setText(name);
	}

	public JCheckBox getAltBox() {
		return altBox;
	}

	public void setAltBox(JCheckBox altBox) {
		this.altBox = altBox;
	}

	public JCheckBox getCtrlBox() {
		return ctrlBox;
	}

	public void setCtrlBox(JCheckBox ctrlBox) {
		this.ctrlBox = ctrlBox;
	}

	public JCheckBox getShiftBox() {
		return shiftBox;
	}

	public void setShiftBox(JCheckBox shiftBox) {
		this.shiftBox = shiftBox;
	}

	public JTextField getKeyField() {
		return keyField;
	}

	public void setKeyField(String key) {
		this.keyField.setText(key);;
	}
	
}
