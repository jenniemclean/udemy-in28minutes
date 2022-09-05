package webapp;

public class UserValidationService {

	public boolean isUserValid(String name, String password) {
		
		if (name.equals("in28minutes")&&password.equals("somepassword")) {
			return true;
		}
		return false;
	}
}
