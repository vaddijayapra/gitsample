package org.sel;

public class param {
	@test
	@parameters {{"User","password"})
	public void sample1(String name,String password) {
	System.out.println("User Name is: "+name);
	}
	@test()
	@parameters({"UserName","password"})
	public void sample2(String name,String password) {
		System.out.println("User Name is:"+name);
		System.out.println("Password value: "+password);
	
	}
	
	}


