
public class Ford extends Car{

	Ford(int s, double r, String c,int m) {
		super(s, r, c);
		this.manufacturerDiscount = m;
	}

	int year;
	int manufacturerDiscount;
	
	double getSalePrice() {      
		return regularPrice - manufacturerDiscount;// From the sale price computed from Car class, subtract the manufacturerDiscount

	}
}
