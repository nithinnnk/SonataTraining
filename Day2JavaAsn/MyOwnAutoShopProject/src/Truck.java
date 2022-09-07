
public class Truck extends Car {
	
	
	Truck(int s, double r, String c,int w) {
		super(s, r, c);
		this.weight = w;
	}
	
	int weight;
	double getSalePrice() {
		
		if (weight>2000)                           // If weight > 2000, 10% discount. Otherwise, 20% discount.

			return  0.1*regularPrice;
		
		else
			return 0.2*regularPrice;
	}	

}
