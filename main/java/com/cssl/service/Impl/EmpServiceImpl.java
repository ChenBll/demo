package com.cssl.service.Impl;

import com.cssl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cssl.dao.EmpDao;
import com.cssl.pojo.Emp;
import com.cssl.service.EmpService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired(required = false)
	private EmpDao ed;
	
	public void setEd(EmpDao ed) {
		this.ed = ed;
	}

	@Override
	public boolean insert(Emp emp) {
		// TODO Auto-generated method stub
		return ed.insert(emp)>0;
	}

	@Override
	@Transactional
	public boolean insertUser(User user) {
		return ed.insertUser(user)>0;
	}

}
