package learningjava;

public class InheritanceDemo {

	public static void main(String[] args) {
		// creating object for employee
		Employee e1= new Employee("Ram",35000);
		e1.raiseSalary(10);
		//System.out.println("The Salary of Employee is : "+e1.getSalary());
		// creating object for Manager
		e1.display();
		System.out.println("===========================");
		Managers m1=new Managers("jhon",65000,0.0);
		m1.setBonus(20000);
		m1.display();
		Employee e2= new Managers("Raghu",70000, 15000.0);//polymorphism dynamic binding
		e2.display();
		 Managers m2 =(Managers)e2;
		 System.out.println(m2.getName());
		
;		//System.out.println("The Salary of Manager is : "+m1.getSalary());
	}

}
