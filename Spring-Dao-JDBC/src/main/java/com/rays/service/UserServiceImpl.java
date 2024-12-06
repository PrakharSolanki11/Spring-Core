package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDaoInt;
import com.rays.dto.UserDto;

@Service
public class UserServiceImpl implements UserServiceInt {
    
	@Autowired
	private UserDaoInt dao;

	
	@Transactional(propagation= Propagation.REQUIRED)
	public long add(UserDto dto) {
		
		long pk = dao.add(dto);
		
		return pk;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void update(UserDto dto) {
		 
	     dao.update(dto);

	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(long id) {

		dao.delete(id);
		
	}
    
	@Transactional(readOnly=true)
	public UserDto findByLogin(String login) {
		
		UserDto dto = dao.findByLogin(login);
		return dto;
	}

	
	@Transactional(readOnly=true)
	public UserDto findByPK(long pk) {
		
		UserDto dto = dao.findByPk(pk);
		
		return dto;
	}
    
	@Transactional(readOnly=true)
	public UserDto authenticate(String login, String password) {
		
		UserDto dto = dao.authenticate(login, password);
		return dto;
	}

	
	@Transactional(readOnly=true)
	public List search(UserDto dto) {
		
		List list = dao.search(dto);
		
		return list;
	}

	
	@Transactional(readOnly=true)
	public List search(UserDto dto, int pageNo, int pageSize) {
		
		List list = dao.search(dto, pageNo, pageSize);

		return list;
	}

}