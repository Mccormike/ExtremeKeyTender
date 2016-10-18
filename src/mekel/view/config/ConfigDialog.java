package mekel.view.config;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import mekel.controller.config.ConfigController;
import mekel.util.Constants;

public class ConfigDialog extends JDialog {

	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JTabbedPane tabPane;
	
	private String gameName;
	
	private JScrollPane scrollPane;
	
	private JPanel configTab;
	
	private ButtonPanel btnPanel;
	
	private KeySetPanel keySetPanel;
	
	private MapperPanel mapperPanel;
	
	private TreePanel treePanel;
	
	private ConfigController configCtrl;
	
	public ConfigDialog(String gameName) throws IOException {
		super();
		this.gameName = gameName;
		initialize();
	}
	
	private void initialize() throws IOException {
		
		configCtrl = new ConfigController(this);
		
		/*
		 * Config
		 */
		this.setTitle(Constants.FRAME_TITLE + " -- Key Mapper");
		this.setBounds(100, 100, 800, 500);
		this.setIconImage(ImageIO.read(getClass().getResourceAsStream("/img/monkey.png")));
		this.setModal(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		/*
		 * Tabbed pane
		 */
		tabPane = new JTabbedPane(JTabbedPane.TOP);
		this.getContentPane().add(tabPane, BorderLayout.CENTER);
		
		/*
		 * config tab
		 */
		configTab = new JPanel();
		configTab.setLayout(new BorderLayout(0,0));
		
		/*
		 * scroll pane
		 */
		scrollPane = new JScrollPane();
		configTab.add(scrollPane, BorderLayout.CENTER);
		
		/*
		 * mapper panel
		 */
		mapperPanel = new MapperPanel();
		mapperPanel.setLayout(new BorderLayout(0,0));
		scrollPane.setViewportView(mapperPanel);
		
		/*
		 * key set panel
		 */
		keySetPanel = configCtrl.generateKeySetPanel();
		mapperPanel.add(keySetPanel, BorderLayout.CENTER);

		/*
		 * tree panel
		 */
		treePanel = new TreePanel();
		configTab.add(treePanel, BorderLayout.WEST);
		
		/*
		 * button panel
		 */
		btnPanel = new ButtonPanel();
		btnPanel.getOkBtn().addActionListener(configCtrl.getBtnController());
		btnPanel.getCancelBtn().addActionListener(configCtrl.getBtnController());
		btnPanel.getApplyBtn().addActionListener(configCtrl.getBtnController());
		this.getContentPane().add(btnPanel, BorderLayout.SOUTH);
		
		tabPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5 style=font-size:12px;font-family:Arial;>Configuration for " + gameName + "</body></html>", null, configTab, null);		
	}

	public ButtonPanel getBtnPanel() {
		return btnPanel;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
