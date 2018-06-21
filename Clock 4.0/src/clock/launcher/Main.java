package clock.launcher;

import clock.display.MainClockFrame;
import clock.handler.FrameController;

/**
 *
 * @author ISSA-PC
 */
public class Main {
    
    public static void main(String[] args)
    {
        FrameController.runFrame(new MainClockFrame());
    }
}
