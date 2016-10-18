package mekel.controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import mekel.view.GamePanel;

/**
 * Controller for detecting if a GamePanel is selected to configure.
 */
public class GamePanelController extends MouseAdapter implements MouseListener{
	
	private ArrayList<GamePanel> panels;
	
	private JPanel selected;
	
	public GamePanelController() {
		setPanels(new ArrayList<GamePanel>());
		setSelected(new JPanel());
	}
	
	public void mouseClicked(MouseEvent e) {
	       JPanel source = ((JPanel) e.getSource());
	       
	       // Find the panel that was clicked and save it for configuration
	       for(JPanel panel : panels) {
	    	   if (source.equals(panel)) {
	    		   panel.setBackground(new Color(58,159,229));
	    		   setSelected(panel);
	    	   } else {
	    		   panel.setBackground(Color.WHITE);
	    	   }
	       }
	}

	public ArrayList<GamePanel> getPanels() {
		return panels;
	}

	public void setPanels(ArrayList<GamePanel> panels) {
		this.panels = panels;
	}

	public JPanel getSelected() {
		return selected;
	}

	public void setSelected(JPanel selected) {
		this.selected = selected;
	}
	
	
}
