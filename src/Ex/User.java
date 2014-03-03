package Ex;
import java.util.ArrayList;

public class User {
	private String username;
	private String password;
	private ArrayList<Uea> listaUea;
		
	public ArrayList<Uea> getListaUea() {
		return listaUea;
	}
	public void setListaUea(ArrayList<Uea> listaUea) {
		this.listaUea = listaUea;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
