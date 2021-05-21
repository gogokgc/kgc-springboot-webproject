package com.kgc.webprj.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgc.webprj.model.RoleType;
import com.kgc.webprj.model.User;
import com.kgc.webprj.repository.UserRepository;

@RestController
public class controllerTest {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/test/join")
	public String join(User user) { // key=value (약속된 규칙)
		System.out.println("username : " + user.getUsername());
		System.out.println("password : " + user.getPassword());
		System.out.println("email : " + user.getEmail());

		user.setRole(RoleType.USER);
		userRepository.save(user);
		return "Membership join complete";
	}
	
	@GetMapping("/test/user/{id}")
	public User detail(@PathVariable Long id) {
		User user = userRepository.findById(id).orElseThrow(()->{
			return new IllegalArgumentException("해당 사용자는 없습니다. id : " + id);
		});
		return user;
	}
	
	@GetMapping("/test/users")
	public List<User> list() {

		return userRepository.findAll();
	}

	
	@GetMapping("/test/userspage")
	public List<User> pageList(@PageableDefault(size = 2, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
		Page<User> pagingUser = userRepository.findAll(pageable);

		List<User> users = pagingUser.getContent(); // findAll 에서 같이 가져오는 데이터중 content 데이터만 수집한다.
		return users;
	}
	
}
