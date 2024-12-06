package com.rays.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDto;
import com.rays.service.UserServiceImpl;
import com.rays.service.UserServiceInt;

@Component("testUserService")
public class TestUserService {

	@Autowired
	private UserServiceInt service;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("testUserService");

		// test.testAdd();
		// test.testUpdate();
		// test.testDelete();
		// test.testFindByPk();
		// test.testFindByLogin();
		//test.testAuthenticate();
		 test.testSearch();

	}

	public void testAdd() {

		UserDto dto = new UserDto();

		// dto.setId(1);
		dto.setFirstName("Prakhar");
		dto.setLastName("Solanki");
		dto.setLogin("solankiprakhar11@gmail.com");
		dto.setPassword("Pass@123");

		long pk = service.add(dto);

		System.out.println("Data Inserted : " + pk);

	}

	public void testUpdate() {

		UserDto dto = new UserDto();

		dto.setId(5);
		dto.setFirstName("Neeraj");
		dto.setLastName("Patil");
		dto.setLogin("neerajpatil07@gmail.com");
		dto.setPassword("Pass@123");

		service.update(dto);

		System.out.println("Data Updated : ");

	}

	public void testDelete() {

		service.delete(6);

	}

	public void testFindByPk() {

		UserDto dto = service.findByPK(1);

		System.out.println(dto.getId() + "  |  " + dto.getFirstName() + "  |  " + dto.getLastName() + "  |  "
				+ dto.getLogin() + "  |  " + dto.getPassword());

	}

	public void testFindByLogin() {

		UserDto dto = service.findByLogin("neerajpatil07@gmail.com");

		System.out.println(dto.getId() + "  |  " + dto.getFirstName() + "  |  " + dto.getLastName() + "  |  "
				+ dto.getLogin() + "  |  " + dto.getPassword());
	}

	public void testAuthenticate() {

		UserDto dto = service.authenticate("neerajpatil07@gmail.com", "Pass@123");

		System.out.println(dto.getId() + "  |  " + dto.getFirstName() + "  |  " + dto.getLastName() + "  |  "
				+ dto.getLogin() + "  |  " + dto.getPassword());

	}

	public void testSearch() {

		UserDto dto = new UserDto();

		List<UserDto> list = service.search(dto, 0, 4);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			dto = (UserDto) it.next();

			System.out.println(dto.getId() + "  |  " + dto.getFirstName() + "  |  " + dto.getLastName() + "  |  "
					+ dto.getLogin() + "  |  " + dto.getPassword());

		}

	}

}
