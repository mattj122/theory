package driver;

import javax.swing.JApplet;
import java.awt.Canvas;
import java.awt.BorderLayout;

public class Fretboard extends JApplet {

	/**
	 * Create the applet.
	 */
	public Fretboard() {
		
		Canvas canvas = new Canvas();
		getContentPane().add(canvas, BorderLayout.CENTER);

	}

}
