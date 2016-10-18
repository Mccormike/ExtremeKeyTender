package mekel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mekel.view.MekelFrame;

/**
 * Enables the Apply button when a profile is changed
 */
public class ProfileController implements ActionListener {

	private MekelFrame frame;
	
	public ProfileController(MekelFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.getMainBtnPanel().getApplyBtn().setEnabled(true);
	}
}
