package examplediploma.services.impl;

import examplediploma.models.UserData;
import examplediploma.services.UserService;

public class DefaultUserService implements UserService {
	
	private static UserService instance;
	
	private DefaultUserService() {
	}

	@Override
	public boolean isAdminUser(UserData user) {
		if (user.getRole().equals("ADMIN_ROLE")) {
			return true;
		} else {
			return false;
		}
	}

	public static synchronized UserService getUserServiceInstance() {
		if (instance == null) {
			instance = new DefaultUserService();
		}
		return instance;
	}

}
