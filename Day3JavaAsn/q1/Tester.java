package Asn3;

public class Tester extends Employee {
	
	public void salCal(){
		System.out.println("This is Tester's salary");
	} 

	public static void main(String[] args) {
		Tester t1 = new Tester();
		t1.salCal();

	}

}
