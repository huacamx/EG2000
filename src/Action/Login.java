package Action;
import Service.LoginService;
import Service.UeasService;
import Ex.User;
public class Login  {
	private User user;
	
	//hay que usar login service
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute(){
		LoginService login = new LoginService();
		
		
		if(login.validate(user)){
			UeasService listaUea = new UeasService();
			user.setListaUea(listaUea.setUpListaUeas());
		return "success";	
		}
	return "LOGIN";		
	}
}
 