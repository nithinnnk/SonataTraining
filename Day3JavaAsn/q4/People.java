
public class People {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TechEmp t=new TechEmp(101,"Nithin ",10000,5,"Java");
		Staff s =new Staff(102,"Sachin ",5000,3);
		Address a1 = new Address(1001," Bangalore","Btm Layout ",560076);
		Address a2 = new Address(1021," Bangalore"," JPnagar ",57200);
		System.out.println(a1.toString());
		System.out.println(t.toString());
		System.out.println("Technical staff salary "+t.calSalary());
		System.out.println("------------staff----------------");
		System.out.println(a2.toString());
		System.out.println(s.toString());
		System.out.println("Staff salary "+s.calSalary());
	}

}
