package learningjava;

class Department implements Cloneable{
	int deptno;
	String name;
	Department(int id, String n)
	{
		deptno=id;
		name=n;
		}
	void display() {
		System.out.println("Dept Id Is :"+deptno);
		System.out.println("Dept name is :"+name);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	}
class Student implements Cloneable{
	// implements Cloneable we using this to give permission to object clonning
	// if we did not use this then it will throw CloneNotSupportedException 
	int id;
	String name;
	Department dept;
	Student(int i, String n,Department d)
	{
		id=i;
		name=n;
		dept=d;
		}
	void display()
	{
		System.out.println("Std Id Is :"+id);
		System.out.println("Std name is :"+name);
		dept.display();
	}	
	// if we want clone Student object then we must override clone() method 
	// in Student class
	// clone method available in object class
	protected Object clone() throws CloneNotSupportedException {
		 Student s=(Student)super.clone();
		 s.dept=(Department)s.dept.clone();
		 return s;
		 
	}

}
public class ObjectCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept=new Department(1,"physics");
		Student s1= new Student(1,"Naruto",dept);
		Student s2=(Student)s1.clone();
		dept.name="maths";
		
		
		// checking the object cloning
		s1.display();
		System.out.println("---------------------------");
		s2.display();
		
		
		 
		 
		}
		
		// if we give like this then both are referring same address
		// it is not object cloning 
		//clone() method present inside Object class only but also
		// we need to implements the cloneable interface//
		
		
		

	}


