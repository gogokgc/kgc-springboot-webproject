package com.kgc.webprj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kgc.webprj.model.RoleType;
import com.kgc.webprj.model.User;
import com.kgc.webprj.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void joinMember(User user) {
		
		user.setRole(RoleType.USER);
		userRepository.save(user);
	}
	
}
