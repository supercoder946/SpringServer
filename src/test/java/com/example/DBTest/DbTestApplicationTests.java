package com.example.DBTest;

import com.example.DBTest.Model.User.User;
import com.example.DBTest.Model.User.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DbTestApplicationTests {

	@Autowired
	private UserDao userDao;

	//@Test
	void addUserTest() {
		User user=new User();
		user.setId("2");
		user.setPassword("5695");
		user.setName("김덕배");
		user.setAge(55);

		userDao.save(user);
	}

	@Test
	void getAllUsersAndDeleteThem(){
		List<User> users= userDao.getAllUsers(); // 받아온 걸 users에 저장해서
		for (User user: users){
			userDao.delete(user); // 다 지움
		}
	}


	//@Test
	void contextLoads() {
	}

}
