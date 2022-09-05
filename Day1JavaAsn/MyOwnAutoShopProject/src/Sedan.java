
public class Sedan extends Car {

	Sedan(int s, double r, String c,int l) {
		super(s, r, c);
		this.length = l;
	}

	
	int length;
	double getSalePrice() {  // If length > 20 feet, 5% discount, Otherwise, 10% discount.
		if (length>20)
			return   (0.1*regularPrice);
		else return   (0.2*regularPrice);
		}
   
  
	   
}

