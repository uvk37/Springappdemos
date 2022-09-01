package com.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.Service.UserAuthentication;

class UserAuthenticationTest {
	
	private UserAuthentication user;

	@BeforeEach
	public void setup() {
		user = new UserAuthentication();
		System.out.println("UserAuthentication class inititated");
	}


	@AfterEach
	public void tearDown() {
		user = null;
		System.out.println("Class Closed");
	}

	@Test
	@DisplayName("UserEmailTest")
	void testUsername() {
		//fail("Not yet implemented");
		assertEquals("uvk@gmail.com", user.username());
	}

	@Test
	public void checkUserNull() {
		assertNotNull(user.username());
	}

	@Test
	@DisplayName("UserPasswordTest")
	void testPaswd() {
		//fail("Not yet implemented");
		assertEquals("307000", user.paswd());
	}

	@Test
	public void checkPassNull() {
		assertNotNull(user.paswd());
	}

	@Test
	public void checkUser1() {
		String email = user.username();
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		assertEquals(true, matcher.matches());

	}

}
