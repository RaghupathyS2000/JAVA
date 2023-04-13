package learningjava;

public class Managers  extends Employee{
	double bonus;

	public Managers(String n, double s,double b) {
		super(n,s);//due to private variables we cannoy access this by normal way 
		bonus=b;
	}
	public void setBonus(double b) {
		bonus=b;
	}
	//method overriding

    public double getSalary() { //due to private variable here we using super()to call super class method
		return super.getSalary()+bonus;
    }
    	
		
		
    }
