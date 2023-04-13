package learningjava;
//wrapper
public class WrapperDemo {
	public static void main(String[] args) {
		Integer i2=Integer.valueOf(10);//to assign value
		int a=44;
		Integer i4=Integer.valueOf(a);//boxing, wrapping
		
		int i= i2.intValue();//unboxing
		System.out.println(i);
		
		Integer i3=80;//in this place compiler will do implicitly Integer.valueOf(80) //autoboxing;
		 
		int k=i3;//compiler do implicitly so it called as auto unboxing
		
		String s= "123";
		int h=Integer.parseInt(s);
		//Here we converting String to int so we using parseInt.
		//The parseInt method is under integer class so we using Intger.Parseint
		System.out.println(h);
		
	}

}
