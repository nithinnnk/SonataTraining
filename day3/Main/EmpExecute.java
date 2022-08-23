package com.sonata.Main;

import com.sonata.Impl.EmpImpl;
import com.sonata.Model.Employee;

public class EmpExecute {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Nithin");
		e1.setEmpSal(100);
		EmpImpl e2 = new EmpImpl();
		System.out.println(e2.yearlysal(e1));
		System.out.println(e2.appsal(e1));

	}

}
