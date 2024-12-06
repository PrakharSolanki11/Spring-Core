package com.rays.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDto;

@Repository
public class UserDAOJDBCImpl implements UserDaoInt {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public long nextPk() {

		String sql = "select max(id) from user";

		long pk = jdbcTemplate.queryForObject(sql, Integer.class);

		System.out.println("Max ID: " + pk);

		return pk + 1;
	}

	public long add(UserDto dto) {

		String sql = "insert into user values(?,?,?,?,?)";

		long id = nextPk();

		long pk = jdbcTemplate.update(sql, id, dto.getFirstName(), dto.getLastName(), dto.getLogin(),
				dto.getPassword());

		return pk;
	}

	public void update(UserDto dto) {

		String sql = "update user set First_Name=? , Last_Name =? , Login=?, Password=?  Where Id=? ";

		int i = jdbcTemplate.update(sql, dto.getFirstName(), dto.getLastName(), dto.getLogin(), dto.getPassword(),
				dto.getId());
		
		System.out.println("Data Updated : " + i);

	}

	public void delete(long id) {

		String sql = "delete from user where id= ?";

		Object[] params = { id };

		int i = jdbcTemplate.update(sql, params);
		
		System.out.println("Data Deleted : " + i);

	}

	public UserDto findByPk(long id) {

		String sql = "select * from user where id = ?";

		Object[] params = { id };

		UserDto dto = jdbcTemplate.queryForObject(sql, params, new UserMapper());

		return dto;

	}

	public UserDto authenticate(String login, String password) {

		String sql = "select * from user where login=? and password = ? ";

		Object[] params = { login, password };

		UserDto dto = jdbcTemplate.queryForObject(sql, params, new UserMapper());

		return dto;
	}

	public UserDto findByLogin(String login) {

		String sql = "select * from user where login=? ";

		Object[] params = { login };

		UserDto dto = jdbcTemplate.queryForObject(sql, params, new UserMapper());

		return dto;
	}

	public List search(UserDto dto) {

		String sql = "select * from user ";

		List list = jdbcTemplate.query(sql, new UserMapper());

		return list;

	}

	public List search(UserDto dto, int pageNo, int pageSize) {

		String sql = "select * from user limit " + pageNo + "," + pageSize;

		List list = jdbcTemplate.query(sql, new UserMapper());

		return list;
	}

}
