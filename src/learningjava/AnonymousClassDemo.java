package learningjava;
class Cycle{
	public void display(){
		System.out.println("Hello I'm Cycle ");
	}}
/*class TriCycle{
	public void display(){
		System.out.println("Hello I'm TriCycle ");
	}}
*/ // instead of creating a new class for just method override we can use
// anonymous class
public class AnonymousClassDemo {

	public static void main(String[] args) {
		Cycle c=new Cycle()//anonymous class
		{
			public void display() {
				System.out.println("Hello I,m Tricycle");
			}
		};
		c.display();
		Cycle c1=new Cycle();
		c1.display();
		// we can use anonymous class in interface concept also [Run class]
	// for one time use only  anonymous class make sense if we want use multiple times
		//creating another class is better way
		
		
		
		
	}

}
