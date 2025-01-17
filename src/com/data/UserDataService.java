//Almicke Navarro and Emily Quevedo
//CST-341
//October 27, 2019 
//This is our own work.

//DATA SERVICE 
//this is the user data service; this will deal with any CRUD operations when interacting with the database
package com.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.model.User;

public class UserDataService implements UserDataInterface{
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	//Default constructor
	public UserDataService() {
		//
	}

	/**
	 * Method to create a new user in the database (register)
	 * @param user
	 * @return boolean
	 */
	@Override
	public boolean create(User user) {
		//output statement for console
		System.out.println("Entering UserDataService.create()");
		String sql = "INSERT INTO ArtistWeb.User(firstName, lastName, username, email, phoneNumber, password, role) VALUES(?, ?, ?, ?, ?, ?, 0)";

		try {
			//output statement for console
			System.out.println("Entering UserDataService.create() with true");
			//execute sql statement
			int rows = jdbcTemplateObject.update(sql, user.getFirstName(), user.getLastName(), user.getUsername(), user.getEmail(), user.getPhoneNumber(), user.getPassword());
			//return result
			return rows == 1 ? true : false;
		}
		
		catch (Exception e) {
			//output statement for console
			System.out.println("Exiting UserDataService.create() with false");
			e.printStackTrace();
		}
		return true;
	}
	
	/**
	 * Method to read a single user in the database (login)
	 * @param user
	 * @return user
	 */		
	@Override
		public User read(User t) {
			//output statement for console
			System.out.println("Entering UserDataService.read()");

			User user = null;
			String sql = "SELECT * FROM ArtistWeb.User WHERE BINARY username = ? AND password = ?";

			try {
				SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql, t.getUsername(), t.getPassword());
				if(srs.next()) {
					System.out.println("Exit UserDataService.read() with a User returned");
					int ID = srs.getInt("ID");
					String firstName = srs.getString("firstName");
					String lastName = srs.getString("lastName");
					String username = srs.getString("username");
					String email = srs.getString("email");
					String phone = srs.getString("phoneNumber");
					String password = srs.getString("password");
					int role = srs.getInt("role");
					user = new User(ID, firstName, lastName, username, email, phone, password, role);
				}
				else {System.out.println("Exit UserDataService.read() with no User returned");};
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return user;
		}		

	 	/**
	 	 * Method that reads all users from the database
	 	 * @param n/a
	 	 * @return arraylist of users
	 	 */
	 	@Override
		public List<User> readAll() {
			// TODO Auto-generated method stub
			List<User> users = new ArrayList<User>(); 
			return users;
		}
	 
		//updates user
		@Override
		public boolean update(User t) {
			// TODO Auto-generated method stub
			return false;
		}

		//deletes user
		@Override
		public boolean delete(int id) {
			// TODO Auto-generated method stub
			return false;
		}
		
		//IoC helper function
		//Spring Data Source to inject into DAO
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
			this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		}
}