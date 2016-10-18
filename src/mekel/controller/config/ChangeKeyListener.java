package mekel.controller.config;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JTextField;

import mekel.view.config.KeyChangeDialog;

/**
 * Controller for mapping a new key bind.
 */
public class ChangeKeyListener implements MouseListener {

	private KeyChangeDialog dialog;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		// Generate a new dialog alerting user to press a key to bind
		// Get the textfield that was clicked
		final JTextField field = (JTextField) e.getSource();
		try {
			dialog = new KeyChangeDialog();
			dialog.getLabel().setText("Press a key to map to " + field.getName() + "...");
			dialog.setFocusable(true);
			// Add a listener that will fire on a key press
			dialog.addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent arg0) {
					// Do nothing
				}
				@Override
				public void keyReleased(KeyEvent arg0) {
					// Update key bind and update textfield with key pressed
					dialog.dispose();
					field.postActionEvent();
					field.setText(" " + KeyEvent.getKeyText(arg0.getKeyCode()).toUpperCase());
				}
				@Override
				public void keyTyped(KeyEvent arg0) {
					// Do nothing
				}
			});
			dialog.setVisible(true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Do nothing
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Do nothing
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Do nothing
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Do nothing
	}
}
