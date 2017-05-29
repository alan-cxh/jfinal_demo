package com.xiaomuedu.common.config;


import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.xiaomuedu.common.model.User;

import net.sf.cglib.transform.impl.InterceptFieldTransformer;

public class HelloController extends Controller {
	
	//@ActionKey("index")
	public void index() {
		System.out.println("console: hello jfinal");
		User user = new User();
		user.setId(new Integer(1));
		user.setUsername("admin");
		user.setPassword("123456");
		user.dao().findById(new Integer(1));
		renderFreeMarker("/login.html");
	}
	
	public static void main(String[] args) {
		
		System.out.println("hello jfinal");
	}

}
