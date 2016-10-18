package mekel.controller.config;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import mekel.util.Constants;
import mekel.view.config.ConfigDialog;
import mekel.view.config.KeyPanel;
import mekel.view.config.KeySetPanel;

/**
 * Main controller for the key mapping dialog.
 */
public class ConfigController {

	
	private ConfigButtonController btnController;
	
	private KeyMapListener keyListener;
	
	private ConfigDialog parentFrame;
	
	/**
	 * Creates a new controller with a button controller and key listener.
	 * @param configDialog the ConfigDialog Dialog
	 */
	public ConfigController(ConfigDialog configDialog) {
		btnController = new ConfigButtonController();
		setKeyListener(new KeyMapListener(configDialog));
		this.parentFrame = configDialog;
		btnController.setParentFrame(parentFrame);
	}


	public ConfigButtonController getBtnController() {
		return btnController;
	}

	public void setBtnController(ConfigButtonController btnController) {
		this.btnController = btnController;
	}

	public ConfigDialog getParentFrame() {
		return parentFrame;
	}

	public void setParentFrame(ConfigDialog parentFrame) {
		this.parentFrame = parentFrame;
	}

	/**
	 * Generates the key panel for key binds
	 * @return the KeySetPanel with generated binds
	 */
	public KeySetPanel generateKeySetPanel() {
		KeySetPanel returnPanel = new KeySetPanel();
		returnPanel.setLayout(new GridLayout(0,1,5,5));
		Random r = new Random();
		ArrayList<KeyPanel> keyPanelList = new ArrayList<>();
		KeyPanel panel;
		char k;
		for(int i = 0; i < 10; i++) {
			panel = new KeyPanel();
			panel.setNameLbl(Constants.BINDS[i]);
			k = (char) (r.nextInt(26) + 65);
			panel.setKeyField(" " + k);
			panel.getCtrlBox().addActionListener(keyListener);
			panel.getShiftBox().addActionListener(keyListener);
			panel.getAltBox().addActionListener(keyListener);
			panel.getKeyField().addActionListener(keyListener);
			panel.getKeyField().setName(Constants.BINDS[i]);
			keyPanelList.add(panel);
		}
		for(KeyPanel key : keyPanelList) {
			returnPanel.add(key);
		}
		return returnPanel;
	}

	public KeyMapListener getKeyListener() {
		return keyListener;
	}


	public void setKeyListener(KeyMapListener keyListener) {
		this.keyListener = keyListener;
	}
}
