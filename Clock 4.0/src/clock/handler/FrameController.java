/*
This class is for to set settings for the frame with a clean way.
 */
package clock.handler;

import javax.swing.JFrame;

/**
 *
 * @author ISSA-PC
 */
public class FrameController {

    public static void runFrame(JFrame frame) { // .. Create a frame with the below options

        frame.setResizable(false); // set resizable false

        frame.setLocationRelativeTo(null); // set location in the center 

        frame.setVisible(true); // set visable

    }
}
