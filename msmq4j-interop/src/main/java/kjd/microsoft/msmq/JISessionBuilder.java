package kjd.microsoft.msmq;

import org.jinterop.dcom.common.IJIAuthInfo;
import org.jinterop.dcom.core.JISession;

public class JISessionBuilder {

	private String domain;
	private String username;
	private String password;
	
	private JISessionBuilder(String domain) {
		this.domain = domain;
		this.username = "Adminstrator";
		this.password = "p@ssword";
	}
	
	public static JISessionBuilder create(String domain) {
		return new JISessionBuilder(domain);
	}
	
	public static JISessionBuilder create(IJIAuthInfo info) {
		return new JISessionBuilder(info.getDomain())
				.username(info.getUserName())
				.password(info.getPassword());
	}
	
	public static JISession localInstance() {
		return JISession.createSession();
	}
	
	public JISessionBuilder domain(String domain) {
		this.domain = domain;
		return this;
	}
	
	public JISessionBuilder username(String username) {
		this.username = username;
		return this;
	}
	
	public JISessionBuilder password(String password) {
		this.password = password;
		return this;
	}
	
	public JISession build() {
		return JISession.createSession(domain, username, password);		
	}
}
