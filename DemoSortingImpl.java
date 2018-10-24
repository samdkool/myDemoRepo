package rnd.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class DemoSortingImpl {
	
	public static void main(String[] args) {
		EmployeeObj e1 = new EmployeeObj(100, "Samanta",50000);
		EmployeeObj e2 = new EmployeeObj(201, "Arjun",90000);
		EmployeeObj e3 = new EmployeeObj(150, "Budha",60000);
		EmployeeObj e4 = new EmployeeObj(112, "PK",70000);
		EmployeeObj e5 = new EmployeeObj(250, "Sunil",80000);
		
		Set<EmployeeObj> s = new TreeSet<EmployeeObj>(new MySorting());
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		System.out.println(s);
		System.out.println();
		HashSet ss = new HashSet<>();
		ss.add(null);
		ss.add("sam");
		ss.add(null);	
		System.out.println(ss);
		
	}

}
