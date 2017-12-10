package mailingService;

public class MailPacket {
	private String smtpHost;
	private String smtpSocketFactoryPort;
	private String smtpSocketFactoryClass;
	private boolean smtpAuth;
	private String smtpPort;
	private String userName;
	private String password;
	private String fromUserId;
	private String toUserId;
	private String subject;
	private String text;

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpSocketFactoryPort() {
		return smtpSocketFactoryPort;
	}

	public void setSmtpSocketFactoryPort(String smtpSocketFactoryPort) {
		this.smtpSocketFactoryPort = smtpSocketFactoryPort;
	}

	public String getSmtpSocketFactoryClass() {
		return smtpSocketFactoryClass;
	}

	public void setSmtpSocketFactoryClass(String smtpSocketFactoryClass) {
		this.smtpSocketFactoryClass = smtpSocketFactoryClass;
	}

	public boolean isSmtpAuth() {
		return smtpAuth;
	}

	public void setSmtpAuth(boolean smtpAuth) {
		this.smtpAuth = smtpAuth;
	}

	public String getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}

}
