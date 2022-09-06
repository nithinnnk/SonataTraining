package com.sonata.Day05;

import java.util.LinkedList;
import java.util.List;

public class StudentAdd {
	public List<Students>addStudents(){
		List<Students> std= new LinkedList<Students>();
		std.add(new Students(1,"Ramesh", 35));
		std.add(new Students(2,"Suresh", 66));
		std.add(new Students(3,"sathish", 66));
		std.add(new Students(4,"Roshan", 82));
		return std;
//		
	}

}
