package cn.javass.hello.struts2impl.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// business logic
	public String execute() {
		System.out.println("����execute����");
		return "SUCCESS";

	}

	// simple validation
	public void validate() {
		if ("yiibai.com".equals(getUsername())) {
			addActionMessage("You are valid user!");
		} else {
			addActionError("I don't know you, dont try to hack me!");
		}
	}

}
