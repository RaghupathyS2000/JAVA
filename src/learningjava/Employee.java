package learningjava;

import java.util.Date;

public class Employee {

		private  String name;
		private double salary;
		private Date date;
		public Employee(String n,double s) {
			name= n;
			salary=s;
			}
		public String getName() {
			return name;
		}
		public void setName(String n) {
			name=n;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double s) {
			salary=s;
		}
		public Date getDate() {
			return date;
			
		}
		public void setDate(Date d) {
			date=d;
		}
		public void raiseSalary(double percent){
			 salary = salary+salary*percent/100;
		}
		public void display() {
			System.out.println("The name of Employee is :"+getName());
			System.out.println("The Salary of Employee is :"+getSalary());
			System.out.println("The joining date of Employee is :"+getDate());
		}
		

	}


