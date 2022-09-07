package Asn3;

public class Square extends Shape{
	
	public Square(double d) {
		this.length=d;
	}


	public double areaCal(){
		return length*length;
	}
	

	public static void main(String[] args) {
		Square s1 = new Square(20.03);
		System.out.println(s1.areaCal());
		

	}

}
