package mekel.controller.config;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mekel.util.Constants;
import mekel.view.config.ConfigDialog;

/**
 * Button controller for the OK, Cancel and Apply buttons
 */
public class ConfigButtonController implements ActionListener{

	private ConfigDialog parentFrame;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String btnName = arg0.getActionCommand();
		
		// Find which button was clicked and do appropriate action
		if (btnName.equals(Constants.S_APPLY)) {
			// Apply it
		} else if (btnName.equals(Constants.S_CANCEL)) {
			// destroy the frame
		} else if (btnName.equals(Constants.S_OK)) {
			// destroy the frame
		}
		parentFrame.dispose();
	}

	public ConfigDialog getParentFrame() {
		return parentFrame;
	}

	public void setParentFrame(ConfigDialog parentFrame2) {
		this.parentFrame = parentFrame2;
	}

}
