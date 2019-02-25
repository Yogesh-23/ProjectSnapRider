package com.alighthub.snapRider.service;

import com.alighthub.snapRider.model.Login;

public interface LoginService {

	public Login addLogin(Login login);

	public Login editLogin(int id);
	
	public Login updateLogin(Login login);
	
	public void deleteLogin(int id);
	
}
