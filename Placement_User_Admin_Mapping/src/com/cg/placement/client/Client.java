package com.cg.placement.client;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.User;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.UserServiceImpl;

public class Client {
	public static void main(String[] args) 
	{
		
	Admin admin= new Admin();
	
	User user = new User();
	IUserService service = new UserServiceImpl();

// Create
	
admin.setId(7);
admin.setName("XYZ");
admin.setPassword("1234");
user.setId(21);
user.setName("yuvraj");
user.setType("user");
user.setPassword("12345");
service.addUser(user);
admin.setUser(user);

System.out.println("Row added");


// Retrieve
/*
user	= service.searchUserById(100);
System.out.println("ID is:"+user.getId());
System.out.println("NAME is:"+user.getName());
System.out.println("Type is:"+user.getType());
	*/


/*
// Update
user	= service.updateUser(user);
user.setId(100);
user.setName("rohit");
user.setPassword("rohit20");
user.setType("admin");
service.updateUser(user);
System.out.println("Update is successful");
user = service.login(user);
admin = service.login(admin);
user.setName("rishab");
user.setPassword("rishab99");
System.out.println("Enter userId :" + admin);
*/

	}
}