package mekel.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import mekel.controller.Controller;
import mekel.util.Constants;

public class MekelFrame extends JFrame {

	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private BorderLayout layout;
	
	private Controller mainCtrl;
		
	private MainButtonPanel mainBtnPanel;
	
	private JTabbedPane tabbedPane;
	
	private ModifyTabPanel modifyTab;
	
	private ProfileTabPanel profileTab;
		
	private CustomizeTabPanel customizeTab;
	
	private JScrollPane scrollPane;
	
	private GameSelectPanel gamePanel;
	
	private ModifyButtonPanel modifyBtnPanel;
	
	private JLabel modifyLbl;

	public MekelFrame() throws IOException {
		super(Constants.FRAME_TITLE);
		initialize();
	}
	
	private void initialize() throws IOException {
		
		mainCtrl = new Controller(this);
		
		/*
		 * Config
		 */
		this.setTitle(Constants.FRAME_TITLE);
		this.setIconImage(ImageIO.read(getClass().getResourceAsStream("/img/monkey.png")));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationByPlatform(true);
		this.setBounds(100, 100, 500, 500);
		this.setResizable(false);
		layout = new BorderLayout();
		this.setLayout(layout);
		
		/*
		 * OK, Cancel, Apply btn panel
		 */
		mainBtnPanel = new MainButtonPanel();
		mainBtnPanel.getApplyBtn().addActionListener(mainCtrl.getBtnController());
		mainBtnPanel.getCancelBtn().addActionListener(mainCtrl.getBtnController());
		mainBtnPanel.getOkBtn().addActionListener(mainCtrl.getBtnController());
		
		this.getContentPane().add(mainBtnPanel, BorderLayout.SOUTH);
		
		/*
		 * Tabbed pane
		 */
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		this.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		/*
		 * Modify btn panel
		 */
		modifyBtnPanel = new ModifyButtonPanel();
		modifyBtnPanel.getConfigureBtn().addActionListener(mainCtrl.getBtnController());
		
		/*
		 * Modify tab
		 */
		modifyTab = new ModifyTabPanel();
		scrollPane = new JScrollPane();
		gamePanel = mainCtrl.populateGameList();
		 
		modifyLbl = new JLabel("Select a game to configure its control scheme:");
		modifyLbl.setFont(new Font(Constants.FONT_NAME, Font.BOLD, Constants.FONT_SIZE));
		modifyLbl.setBackground(Color.WHITE);
		
		modifyTab.add(modifyBtnPanel, BorderLayout.SOUTH);
		modifyTab.add(modifyLbl, BorderLayout.NORTH);
		scrollPane.setViewportView(gamePanel);
		scrollPane.setEnabled(true);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		modifyTab.add(scrollPane, BorderLayout.CENTER);
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style=font-size:12px;font-family:Arial;>Modify</body></html>", null, modifyTab, null);
		
		/*
		 * Other tabs
		 */
		profileTab = new ProfileTabPanel();
		customizeTab = new CustomizeTabPanel();
		
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style=font-size:12px;font-family:Arial;>Profile</body></html>", null, profileTab, null);
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style=font-size:12px;font-family:Arial;>Customize</body></html>", null, customizeTab, null);
	}

	public MainButtonPanel getMainBtnPanel() {
		return mainBtnPanel;
	}
}
