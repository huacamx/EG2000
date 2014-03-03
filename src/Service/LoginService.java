package Service;

import Ex.User;

public class LoginService {
	
	
	public boolean validate(User user){
		if(user.getUsername().equals("huaca") && user.getPassword().equals("1234")){
			return true;
		}
	return false;
	}
}
