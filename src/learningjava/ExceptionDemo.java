package learningjava;
import java.io.*;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args){
		int a=10;
		int b=0;
		try {
			int arr[]=null;
			System.out.println(arr[1]);//if one exception occurs then rest of the
			//try block will be ignored
		int c=a/b;
		System.out.println(c);
		}
		//if there is no exception then it will execute only try block
		//catch block will completely will ignored
		//multiples catch blocks are allowed 
		catch(ArithmeticException |NullPointerException e){
			System.out.println("Catching both Arithmetic or NullPointer Exception  ");
		}
		
		finally {
			System.out.println("hello from finally executed whatever happens");
		}
		File file=new File("abc.txt");
		try {
			FileInputStream fs =new FileInputStream(file);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("hellllo");
		}
     
		try (Scanner s = new Scanner(System.in)) {
			int i= s.nextInt();
		
			System.out.println("the value of i is :"+i);
		}
	
	//user---defined---Exception----
	double bal=500.00;
	double withdraw= 700.00;
	try {
	if(bal<withdraw)
		throw new InsufficientFundException(withdraw-bal);
	}
	catch(InsufficientFundException e) {
		System.out.println("Not enough money");
	}
	
	
	
	}
	
		
		

	}

