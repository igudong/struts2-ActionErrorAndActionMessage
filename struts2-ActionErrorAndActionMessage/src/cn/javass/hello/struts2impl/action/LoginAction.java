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
		System.out.println("进入execute方法");
		return "SUCCESS";

	}

	/*
	 * 当重写了validate()方法的时候，进入action请求会进行验证，，验证通过会进入execute()方法，
	 * 如果验证不通过，则返回不进入execute()方法，直接返回请求
	 */
	public void validate() {
		if ("yiibai.com".equals(getUsername())) {
			addActionMessage("You are valid user!");
		} else {
			addActionError("I don't know you, dont try to hack me!");
		}
	}

}
