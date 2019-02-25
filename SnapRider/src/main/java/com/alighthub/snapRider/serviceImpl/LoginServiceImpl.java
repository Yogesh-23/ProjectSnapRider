package com.alighthub.snapRider.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.snapRider.dao.LoginDao;
import com.alighthub.snapRider.model.Login;
import com.alighthub.snapRider.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao logindao;
	
	
	public Login addLogin(Login login) {
		
		return logindao.save(login);
	}

	@Override
	public Login editLogin(int id) {

		return logindao.findById(id).get();
	}

	@Override
	public Login updateLogin(Login login) {
		// TODO Auto-generated method stub
		return logindao.save(login);
	}

	@Override
	public void deleteLogin(int id) {
		// TODO Auto-generated method stub
		logindao.deleteById(id);
	}

}
