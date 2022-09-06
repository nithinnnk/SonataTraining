package com.sonata.Day05;

import java.util.List;

public class LambdaClss {
	public List<Students>marksSort(){
		List<Students>std1=new StudentAdd().addStudents();
				System.out.println("Sort according to marks");
				std1.sort((Students s1, Students s2)->s1.getMarks()-s2.getMarks());
				// std.sort((Students n1, Students n2)->n1.getStdName().compareTo(n2.getStdName()));
				return std1; 
			 }
			
			
			public List<Students>nameSort(){
				System.out.println("Sorting according to name");
			List<Students>std2=new StudentAdd().addStudents();
			 std2.sort((Students n1, Students n2)->n1.getStdName().compareTo(n2.getStdName()));
			return std2; 
		 }
			
		public static void main (String args[]) 
			{
				System.out.println(new LambdaClss().marksSort());
				System.out.println(new LambdaClss().nameSort());
			}

}
