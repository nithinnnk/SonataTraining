package Asn3;

public class Rectangle extends Shape {
	
	
	public Rectangle(double i, double j) {
		this.length = i;
		this.width = j;
		
	}

	public double areaCal(){
		return length*width;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(20.76,10.55);
		System.out.println(r1.areaCal());		

	}

}
