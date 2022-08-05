package com.cssl.service;

import com.cssl.pojo.Emp;
import com.cssl.pojo.User;

public interface EmpService {
	boolean insert(Emp emp);

	boolean insertUser(User user);
}
