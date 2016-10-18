package mekel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import mekel.util.Constants;
import mekel.view.MekelFrame;
import mekel.view.config.ConfigDialog;

/**
 * Controller for the main buttons OK, Cancel, Apply, Configure
 */
public class ButtonController implements ActionListener {
	
	private GamePanelController gpc;
	
	private MekelFrame parent;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String btnName = arg0.getActionCommand();
		
		// Find which button was clicked and do appropriate acion
		if (btnName.equals(Constants.S_CONFIG)) {
			// Show configure frame
			ConfigDialog frm;
			try {
				frm = new ConfigDialog(gpc.getSelected().getName());
				frm.setLocationRelativeTo(parent);
				frm.setAlwaysOnTop(true);
				frm.setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if (btnName.equals(Constants.S_APPLY)) {
			// Exit
			System.exit(0);
		} else if (btnName.equals(Constants.S_OK)) {
			// Exit
			System.exit(0);
		} else {
			// Exit
			System.exit(0);
		}
	}
	
	public MekelFrame getParent() {
		return parent;
	}

	public void setParent(MekelFrame parent) {
		this.parent = parent;
	}

	public GamePanelController getGpc() {
		return gpc;
	}

	public void setGpc(GamePanelController gpc) {
		this.gpc = gpc;
	}
}
