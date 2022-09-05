package Day02Example;

public class Prod {
	int proId;
	String proName;
	double proPrice;
	
	Prod(int i, String n , double p ){
		this.proId= i;
		this.proName = n;
		this.proPrice = p;
		}
	
	 public static double price(double proPrice) {
		 double total= 0.18*proPrice + proPrice;
		 return total ;
	    }
	
	public static void main(String[] args) {
		Prod p1 = new Prod(12,"Samsung M20",10000);
		Prod p2 = new Prod(12,"Samsung A20",12000);
		Prod p3 = new Prod(12,"Samsung C20",15000);
		System.out.println( "Price after GST =" + " "+price(p1.proPrice)+" Rs");
		System.out.println( "Price after GST =" + " "+price(p2.proPrice)+" Rs");
		System.out.println( "Price after GST =" + " "+price(p3.proPrice)+" Rs");
		}

}
