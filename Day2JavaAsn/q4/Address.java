
public class Address {
	int doorNo;
	String city;
	String street;
	int pincode;
	Address(int doorNo, String city,String street,int pincode){
		this.doorNo=doorNo;
		this.city=city;
		this.street=street;
		this.pincode=pincode;
	}
	public String toString() {
		return "Adress\n"+doorNo+city+street+pincode;
	}

}
