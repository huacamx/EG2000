package Action;
import Service.LoginService;
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
		return "success";	
		}
	return "LOGIN";		
	}
}
 