package dao;

import model.User;

public interface UserDao {
	// CREATE
	public int insertUser(User u);

	// READ
	public User selectUserById(int id);

	public User selectUserByUsernameAndPassword(String username, String password);

	// UPDATE
	public int updateUser(User u);

}
