import org.apache.commons.mail.*;

class EmailSender {

	public static void SendWithAttachment(String pathToAttachment, String description, String yourName, String host, 
			String emailTo, String nameTo, String emailFrom, String nameFrom, String subject, String msg) throws EmailException {

		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath(pathToAttachment);
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription(description);
		attachment.setName(yourName);

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName(host);
		email.addTo(emailTo, nameTo);
		email.setFrom(emailFrom, nameFrom);
		email.setSubject(subject);
		email.setMsg(msg);

		// add the attachment
		email.attach(attachment);

		// send the email
		email.send();
	}
}
