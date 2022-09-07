
public class MyOwnAutoShop extends Car{

	MyOwnAutoShop(int s, double r, String c) {
		super(s, r, c);
		
	}

	public static void main(String[] args) {
		
		Sedan s1 = new Sedan(140,500000.0,"white",24);
	    
		System.out.println("Selling Price of Sedan = "+ (s1.regularPrice-s1.getSalePrice() )+ " inr");
		System.out.println("Discount price of the Sedan is " + s1.getSalePrice()+ " inr");
			
		
		
		Ford f1 = new Ford(160,800000.00,"blue",34000);
		System.out.println("Price after discount on selected model is" + f1.getSalePrice() + " inr");
		Ford f2 = new Ford(200,1400000.00,"red",150000);
		System.out.println("Price after discount on selected model is " + f2.getSalePrice() + " inr");
		
	   
	    
		Truck t1 = new Truck(120,550000.00,"blue",2001);
		System.out.println("Selling Price of Truck is  " + t1.regularPrice +" inr"); 
		System.out.println("Price after discount on selected model is" + t1.getSalePrice()); 
		
	    
		  


	}

}
