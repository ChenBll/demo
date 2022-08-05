package com.cssl.dao;



import com.cssl.pojo.Emp;
import com.cssl.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDao {
	
	int insert(Emp emp);

	int insertUser(User user);
	
}
