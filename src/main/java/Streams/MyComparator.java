package Streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return 0;
	}
	public class SortExampleEmployee {
		
	

	public void main(String[] args) {
		List<Employee> employee = DataBaseEmp.getEmployee();
		
		Collections.sort(employee,(o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()));
		System.out.println(employee);
		
		employee
		.stream()
		.sorted((o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()))
		.forEach(System.out::println);
		
	}
		
	}

	

}
