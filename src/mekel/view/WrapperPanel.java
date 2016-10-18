package mekel.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import mekel.util.Constants;

public class WrapperPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox<String> profileBox;

	public WrapperPanel() {
		super();
		initialize();
	}

	private void initialize() {

		this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		this.setOpaque(false);
		/*
		 * Combobox for profiles
		 */
		profileBox = new JComboBox<String>();
		profileBox.setFont(new Font(Constants.FONT_NAME, Font.PLAIN, 12));
		profileBox.setPreferredSize(new Dimension(Constants.PBOX_W, Constants.PBOX_H));
		this.add(profileBox);
	}

	public JComboBox<String> getProfileBox() {
		return profileBox;
	}

	public void setProfileBox(JComboBox<String> profileBox) {
		this.profileBox = profileBox;
	}
	
	public JComboBox<String> getProfileBox1() {
		return profileBox;
	}

	public void setProfileBox(ComboBoxModel<String> profiles) {
		this.profileBox.setModel(profiles);
	}

}
