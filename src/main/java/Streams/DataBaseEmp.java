package Streams;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {

	public static List<Employee>getEmployee() {
		List<Employee>list = new ArrayList();
		list.add(new Employee(172,"Roshan","IT",9000));
		list.add(new Employee(173,"Santosh","Civil",3000));
		list.add(new Employee(174,"Bimal","Defence",4000));
		list.add(new Employee(175,"Prakash","Mechanic",7000));
		list.add(new Employee(176,"Nithin","Developer",10000));
		return list;
	}

}
