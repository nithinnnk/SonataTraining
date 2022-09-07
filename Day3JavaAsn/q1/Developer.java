package Asn3;

public class Developer extends Employee {
	
	public void salCal(){
		System.out.println("This is Developer's salary");
	} 

	public static void main(String[] args) {
		
		Developer d1 = new Developer();
		d1.salCal();		

	}

}
