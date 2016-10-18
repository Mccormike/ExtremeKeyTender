package mekel.controller.config;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mekel.view.config.ConfigDialog;

/**
 * Enables the apply button when user changes binds
 */
public class KeyMapListener implements ActionListener {

	private ConfigDialog dialog;
	
	public KeyMapListener(ConfigDialog dialog) {
		this.dialog = dialog;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		dialog.getBtnPanel().getApplyBtn().setEnabled(true);
	}
}
