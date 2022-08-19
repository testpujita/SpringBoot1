package net.javaguides.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.users;
import net.javaguides.springboot.repository.UsersRepository;
import net.javaguides.springboot.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
	private UsersRepository userRepository;

	public UsersServiceImpl(UsersRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public users saveUser(users usrs) {
		return userRepository.save(usrs);
	}
 


                                                                                               
}
