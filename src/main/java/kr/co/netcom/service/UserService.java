package kr.co.netcom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kr.co.netcom.domain.User;
import kr.co.netcom.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Page<User> getUsers(Pageable pageable) {
		return userRepository.findAll(pageable);
	}
	
}
