package mailingService;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailServiceSSL {
	private Properties mailProperties;
	private Session session;
	private Message message;
	private MailPacket mailPacket;

	public void sendEmail(MailPacket mailPacket) {
		this.mailPacket = mailPacket;
		setMailServerProperties();
		setSession();
		try {
			setEmailPacket();
			Transport.send(message);
			System.out.println("Mail Sent");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	private void setMailServerProperties() {
		mailProperties = new Properties();
		mailProperties.put("mail.smtp.host", mailPacket.getSmtpHost());
		mailProperties.put("mail.smtp.socketFactory.port", mailPacket.getSmtpPort());
		mailProperties.put("mail.smtp.socketFactory.class", mailPacket.getSmtpSocketFactoryClass());
		mailProperties.put("mail.smtp.auth", mailPacket.isSmtpAuth());
		mailProperties.put("mail.smtp.port", mailPacket.getSmtpPort());
	}

	private void setSession() {
		session = Session.getDefaultInstance(mailProperties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mailPacket.getUserName(), mailPacket.getPassword());
			}
		});
	}

	private void setEmailPacket() throws AddressException, MessagingException {
		message = new MimeMessage(session);
		message.setFrom(new InternetAddress(mailPacket.getFromUserId()));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailPacket.getToUserId()));
		message.setSubject(mailPacket.getSubject());
		message.setText(mailPacket.getText());
	}
}
