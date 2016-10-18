package mekel;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mekel.view.MekelFrame;

public class Main {

	private static MekelFrame frmMekel;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try {
						// Changes the default ui to the ui of the system ie Windows, Mac, etc.
						UIManager.setLookAndFeel(
								UIManager.getSystemLookAndFeelClassName());
					} 
					catch (UnsupportedLookAndFeelException e) {
						// handle exception
					}
					catch (ClassNotFoundException e) {
						// handle exception
					}
					catch (InstantiationException e) {
						// handle exception
					}
					catch (IllegalAccessException e) {
						// handle exception
					}
					// Create the frame and show it
					frmMekel = new MekelFrame();
					frmMekel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
