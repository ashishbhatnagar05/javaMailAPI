package mailingService;

import org.junit.Before;
import org.junit.Test;

public class JavaMailServiceSSLTest {
	private MailPacket mailPacket;

	private static final String smtpHost = "smtp.gmail.com";
	private static final String smtpSocketFactoryPort = "465";
	private static final String smtpSocketFactoryClass = "javax.net.ssl.SSLSocketFactory";
	private static final boolean smtpAuth = true;
	private static final String smtpPort = "465";
	private static final String userName = "";
	private static final String password = "";
	private static final String fromUserId = "";
	private static final String toUserId = "";
	private static final String subject = "Message from Java Mail Client";
	private static final String text = "The mail is sent and drafted from java Mail client";

	@Before
	public void setup() {
		mailPacket = new MailPacket();
	}

	@Test
	public void sendMailTest() {
		JavaMailServiceSSL javaMailServiceSSL = new JavaMailServiceSSL();
		setMailPacket();
		javaMailServiceSSL.sendEmail(mailPacket);
		System.out.println("Mail Sent");
	}

	private void setMailPacket() {
		mailPacket.setSmtpHost(smtpHost);
		mailPacket.setSmtpSocketFactoryPort(smtpSocketFactoryPort);
		mailPacket.setSmtpSocketFactoryClass(smtpSocketFactoryClass);
		mailPacket.setSmtpAuth(smtpAuth);
		mailPacket.setSmtpPort(smtpPort);
		mailPacket.setUserName(userName);
		mailPacket.setPassword(password);
		mailPacket.setFromUserId(fromUserId);
		mailPacket.setToUserId(toUserId);
		mailPacket.setSubject(subject);
		mailPacket.setText(text);
	}
}
