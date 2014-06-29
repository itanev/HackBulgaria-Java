import java.io.IOException;

import org.apache.commons.mail.EmailException;


public class Main {

	public static void main(String[] args) {

		try {
			JToaster.ShowTasterAfter(10);
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			EmailSender.SendWithAttachment("D:/temp/java/Libraries/files/attachment.gif",
//					"Some funny attachment",
//					"My name", 
//					"smtp.gmail.com", 
//					"iliyan.tanev@gmail.com",
//					"Iliyan Tanev", 
//					"me@yourmail.com", 
//					"Me", 
//					"Some attachment",
//					"Some message");
//		} catch (EmailException e) {
//			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
