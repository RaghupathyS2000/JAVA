package learningjava;

public class Run {

	public static void main(String[] args) {
	Ola o = new Ola();
		o.map();
	Swiggy s = new Swiggy();
	s.map();
	s.display();
	Zomato z = new Zomato();
	z.map();
	z.display();
	GoogleMap g1= new GoogleMap() {//anonymous class concept
		public void map() {
			System.out.println("Zepto can use Google Map through api");
		}
	};
	g1.map();
	// lambda expression -  It Must Be AFunctional Interface
	// only one abstract method inside GoogleMap interface so we are
	//using lambda expression 
	GoogleMap g2= ()->System.out.println("Uber Also Using Google Map through api");
	g2.map();
		
	
		

	}

}
 