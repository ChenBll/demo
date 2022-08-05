package com.cssl.controller;

import com.cssl.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cssl.pojo.Emp;
import com.cssl.service.EmpService;

@Controller
public class EmpController {
	int c=2000;



	@Autowired
	private EmpService es;
	
	@RequestMapping("/regist")
	public String saveEmp(Emp emp) {
		System.out.println(emp);
		if(es.insert(emp)) {
			return "success";
		}
		return "index";
	}

	
	@RequestMapping("/registuser")
	public  String saveUser(User user){
		if(es.insertUser(user)){
			return "success";
		}
		return "index";
	}
	
	

	
}
