package rnd.collections;

import java.util.Comparator;

public class MySorting implements Comparator<EmployeeObj> {

	@Override
	public int compare(EmployeeObj e1, EmployeeObj e2) {
		if (e1.getId() < e2.getId())
			return -1;

		else if (e1.getId() > e2.getId())
			return 1;

		else if (e1.getId() == e2.getId())
			return 0;
		return 0;
	}
	
	
	public int compare1(EmployeeObj e1, EmployeeObj e2) {
		return e1.getName().compareTo(e2.getName());
	}
		
		
	

}
