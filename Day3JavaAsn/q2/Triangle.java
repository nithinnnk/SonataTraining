package Asn3;

public class Triangle extends Shape {
	
	public Triangle(double p, double q) {
		this.length = p;
		this.width = q;
	}
	
	public double areaCal(){
		return 0.5*length*width;
	}
	

	public static void main(String[] args) {
		Triangle t1 = new Triangle(20,30);
		System.out.println(t1.areaCal());
		

	}

}
