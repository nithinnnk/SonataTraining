package Day02Example;

public class TShirt {
	
	String color;
	String material;
	String design;
	
	TShirt(String c , String m, String d) {
		
		this.color= c;
		this.material= m;
		this.design= d;
	}
		void small() {
			System.out.println("small size selected: "+color+" "+material+" "+design);
		}
		void large() {
			System.out.println("large size selected: "+color+" "+material+" "+design);
		}
		void xtra_large() {
			System.out.println("Xtra-Large size selected: "+color+" "+material+" "+design);
		}
		
		
		

	public static void main(String[] args) {
		TShirt t1 = new TShirt("blue","cotton","plane");
		TShirt t2 = new TShirt("black","nylon","pattern");
		TShirt t3 = new TShirt("red","blend","shapes");
		
		t1.small();
		t2.large();
		t3.xtra_large();
		

	}

}
