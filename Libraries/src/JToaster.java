import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.nitido.utils.toaster.Toaster;


public class JToaster {
	
	public static void ShowTasterAfter(int seconds) throws InterruptedException, IOException {
		
		Thread.sleep(seconds * 1000);
		
		Toaster toasterManager = new Toaster();
		
		toasterManager.setToasterWidth(400);
		toasterManager.setToasterHeight(200);
		
		BufferedImage backgroundImage = null;
		backgroundImage = ImageIO.read(new File("D:/temp/java/Libraries/files/background.jpg"));
		
		toasterManager.setBackgroundImage(backgroundImage);
		
	    toasterManager.showToaster( "Get a little rest, will you?" );
	}
}
