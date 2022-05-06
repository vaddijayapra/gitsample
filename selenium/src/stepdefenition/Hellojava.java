package stepdefenition;

import java.util.ArrayList;
import java.util.List;

public class Hellojava {
	public static void main(String[] args) {
		List<String> emp = new ArrayList<String>();
		emp.add("Joe");
		emp.add("Susee");
		emp.add("Anu");
		emp.add("Jenny");
		
		String data = emp.get(2);
		System.out.println(data);
		
	}

}
