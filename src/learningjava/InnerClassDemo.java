package learningjava;
//Inner-Class
//=======================================================

class Outer{//outer class
	int num;
	void outerDisplay() {
		System.out.println("Outter Display");
	}
	class Inner{//inner class
		int n;
		void innerDisplay() {
			System.out.println("Inner Display");
		}
	}
	static class  Hello{//innerclass
		int x;
		void helloDisplay() {
			System.out.println("Hello Display");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
	// creating object for outter class
		Outer o=new Outer();
		o.num=20;
		o.outerDisplay();
		// inside another class so directly creating object throws errorInner i= new Inner();
		Outer.Inner i= o.new Inner();//creating object for inner class
		i.innerDisplay();
		// When inner class is static 
		Outer.Hello h= new Outer.Hello();
		h.helloDisplay();

	}

}
