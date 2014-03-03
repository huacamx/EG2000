package org.koushik.javabrains.action;

public class TutorialAction {
	private String hola;
	public String getHola() {
		return hola;
	}
	public void setHola(String hola) {
		this.hola = hola;
	}
	public String execute(){
		this.hola = "Hello GE from Struts2";
		return "success";
	}

}
