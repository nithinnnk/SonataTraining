
public abstract class Employe {
	int empid;
	String empName;
	//String Address;
	double basicPay;
	int noOfLeaves;
	
	Employe(int empid, String empName, double basicPay,int noOfLeaves){
		this.empid=empid;
		this.empName=empName;
		this.basicPay=basicPay;
		this.noOfLeaves=noOfLeaves;
	}
	
	public  abstract double calSalary();

}
