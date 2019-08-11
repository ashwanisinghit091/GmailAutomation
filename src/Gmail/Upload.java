package Gmail;

import java.awt.*;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Upload {

	
	
	
	 public static void uploadFileWithRobot (String imagePath) throws AWTException, InterruptedException {
	        StringSelection stringSelection = new StringSelection(imagePath);
	       // Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	       //.setContents(stringSelection, null);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	        Robot robot = new Robot();
	        Thread.sleep(1000);
	             
	        
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	        
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	    }
}

		