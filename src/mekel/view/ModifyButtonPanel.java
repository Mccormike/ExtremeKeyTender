package mekel.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import mekel.util.Constants;

public class ModifyButtonPanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;
	
	private FlowLayout layout;
	
	private JButton configureBtn;
			
	public ModifyButtonPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Config
		 */
		this.setBackground(Color.WHITE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		this.setLayout(layout);
		
		setConfigureBtn(new JButton(Constants.S_CONFIG));
		
		this.add(configureBtn);
	}

	public JButton getConfigureBtn() {
		return configureBtn;
	}

	public void setConfigureBtn(JButton configureBtn) {
		this.configureBtn = configureBtn;
	}
}
