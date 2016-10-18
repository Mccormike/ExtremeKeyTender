package mekel.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import mekel.util.Constants;
import mekel.view.GamePanel;
import mekel.view.GameProfilePanel;
import mekel.view.GameSelectPanel;
import mekel.view.MekelFrame;
import mekel.view.WrapperPanel;

/**
 * Main controller for the application. Handles MekelFrame actions.
 */
public class Controller {

	
	private MekelFrame frame;
	
	private ButtonController btnController;
	
	private GamePanelController gameController;
	
	private ProfileController profileController;
	
	/**
	 * Creates a new controller with a button, panel and game selection controller.
	 * @param frame the MekelFrame
	 */
	public Controller(MekelFrame frame) {
		this.frame = frame;
		this.setProfileController(new ProfileController(frame));
		this.setBtnController(new ButtonController());
		this.setGameController(new GamePanelController());
		this.btnController.setGpc(gameController);
		this.btnController.setParent(frame);
	}

	/**
	 * Generates the list view for the games
	 * @return the panel containing the views for each game
	 * @throws IOException 
	 */
	public GameSelectPanel populateGameList() throws IOException {
				
		ArrayList<GamePanel> panelList = new ArrayList<>();
		GamePanel gamePanel;
		GameSelectPanel selectPanel = new GameSelectPanel();
		GameProfilePanel gpp;
		WrapperPanel wp;
		DefaultComboBoxModel<String> cmbModel;
		// Loop through each game grabbing the icon, profiles,
		// bg image, name
		for(int i = 0; i < Constants.GAMES.length; i++) {
			gamePanel = new GamePanel();
			gamePanel.setName(Constants.GAMES[i]);
			wp = new WrapperPanel();
			gamePanel.addMouseListener(gameController);
			cmbModel  = new DefaultComboBoxModel<>();
			gpp = new GameProfilePanel(ImageIO.read(getClass().getResourceAsStream(Constants.BGS[i])));
			gpp.add(wp, BorderLayout.CENTER);
			gpp.setNameLbl(Constants.GAMES[i]);
			// Load its profiles
			cmbModel.addElement("TestProfile1");
			cmbModel.addElement("TestProfile2");
			wp.setProfileBox(cmbModel);
			wp.getProfileBox().addActionListener(profileController);
			// add icon
			gamePanel.getIconLabel().setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream(Constants.IMGS[i]))));
			gamePanel.add(gpp, BorderLayout.CENTER);
			panelList.add(gamePanel);
		}
		gameController.setPanels(panelList);
		gameController.setSelected(panelList.get(0));
		panelList.get(0).setBackground(new Color(58,159,229));
		for(GamePanel gp : panelList) {
			selectPanel.add(gp);
		}
		return selectPanel;
	}
	
	public MekelFrame getFrame() {
		return frame;
	}

	public void setFrame(MekelFrame frame) {
		this.frame = frame;
	}

	public ButtonController getBtnController() {
		return btnController;
	}

	public void setBtnController(ButtonController btnController) {
		this.btnController = btnController;
	}

	
	public GamePanelController getGameController() {
		return gameController;
	}

	public void setGameController(GamePanelController gameController) {
		this.gameController = gameController;
	}

	public ProfileController getProfileController() {
		return profileController;
	}

	public void setProfileController(ProfileController profileController) {
		this.profileController = profileController;
	}
}
