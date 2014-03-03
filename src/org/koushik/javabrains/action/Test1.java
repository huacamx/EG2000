package org.koushik.javabrains.action;

public class Test1 {
	private String user;
	private String password;

	public String execute(){
		if(getUser().equals("user") && getPassword().equals("password") )  {
		return "success";	
		}
	return "failure";		
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}