package mekel.view.config;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import mekel.util.Constants;

public class ButtonPanel extends JPanel{
	/**
	 * Default serial id.
	 */
	private static final long serialVersionUID = 1L;

	private JPanel btnWrapper;
	
	private JCheckBox defaultBox;
	
	private JButton okBtn;
	
	private JButton cancelBtn;
	
	private JButton applyBtn;
	
	private BorderLayout layout;
	
	public ButtonPanel() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/*
		 * Config
		 */
		layout = new BorderLayout(0,0);
		this.setLayout(layout);
		this.setBackground(Color.WHITE);
		
		btnWrapper = new JPanel();
		btnWrapper.setBackground(Color.WHITE);
		FlowLayout fl = (FlowLayout) btnWrapper.getLayout();
		fl.setAlignment(FlowLayout.LEFT);
		btnWrapper.setLayout(fl);
		this.add(btnWrapper, BorderLayout.WEST);
		
		/*
		 * Buttons
		 */
		okBtn = new JButton(Constants.S_OK);
		btnWrapper.add(okBtn);
		
		cancelBtn = new JButton(Constants.S_CANCEL);
		btnWrapper.add(cancelBtn);
		
		applyBtn = new JButton(Constants.S_APPLY);
		applyBtn.setEnabled(false);
		btnWrapper.add(applyBtn);
		
		/*
		 * Checkbox
		 */
		defaultBox = new JCheckBox("Set as default");
		defaultBox.setBackground(Color.WHITE);
		this.add(defaultBox, BorderLayout.EAST);
		
	}

	public JPanel getBtnWrapper() {
		return btnWrapper;
	}

	public void setBtnWrapper(JPanel btnWrapper) {
		this.btnWrapper = btnWrapper;
	}

	public JCheckBox getDefaultBox() {
		return defaultBox;
	}

	public void setDefaultBox(JCheckBox defaultBox) {
		this.defaultBox = defaultBox;
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

	public BorderLayout getLayout() {
		return layout;
	}

	public void setLayout(BorderLayout layout) {
		this.layout = layout;
	}
	
	
}
