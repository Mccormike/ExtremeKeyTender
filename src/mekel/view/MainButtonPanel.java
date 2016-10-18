package mekel.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import mekel.util.Constants;

public class MainButtonPanel extends JPanel{

	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JButton cancelBtn;
	
	private JButton okBtn;
	
	private JButton applyBtn;
	
	private FlowLayout layout;
	
	public MainButtonPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Config
		 */
		layout = new FlowLayout(FlowLayout.RIGHT, 5, 5);
		this.setLayout(layout);
		
		setOkBtn(new JButton(Constants.S_OK));
		
		setCancelBtn(new JButton(Constants.S_CANCEL));
		
		setApplyBtn(new JButton(Constants.S_APPLY));
		
		applyBtn.setEnabled(false);
		
		this.add(okBtn);
		this.add(cancelBtn);
		this.add(applyBtn);
	}

	public JButton getOkBtn() {
		return okBtn;
	}

	public void setOkBtn(JButton okBtn) {
		this.okBtn = okBtn;
	}

	public JButton getCancelBtn() {
		return cancelBtn;
	}

	public void setCancelBtn(JButton cancelBtn) {
		this.cancelBtn = cancelBtn;
	}

	public JButton getApplyBtn() {
		return applyBtn;
	}

	public void setApplyBtn(JButton applyBtn) {
		this.applyBtn = applyBtn;
	}
}
