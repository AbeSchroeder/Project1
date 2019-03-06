

import java.util.List;

import com.revature.DAO.UserDAO;
import com.revature.models.UserRoles;
import com.revature.models.Users;

public class test {
	public static void main(String[] args)
	{
	
	UserDAO userDao = new UserDAO();
	UserRoles role = new UserRoles(2);
	Users newUser = new Users(1,"Abes", "4321", "Abraham", "Shredder", role);
	userDao.update(newUser);
	userDao.delete(3);
	
	List<Users> allUsers = userDao.getAll();
	for(Users e: allUsers)
	{
		System.out.println(e);
	}
	
}
}
