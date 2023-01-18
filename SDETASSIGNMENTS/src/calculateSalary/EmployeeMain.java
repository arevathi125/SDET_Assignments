package calculateSalary;

import java.util.Scanner;

public class EmployeeMain {
	final float pf;
public EmployeeMain() {
	this.pf = 12f;
}
	public static void main(String[] args) {
		Scanner salary = new Scanner(System.in);
		System.out.println("Enter your basic salary : ");
		int basic = salary.nextInt();
		System.out.println("Enter your BOA : ");
		int boa = salary.nextInt();
		System.out.println("Enter your bonus : ");
		int bonus = salary.nextInt();
		employee e = new employee();
		e.setBasic(basic);
		e.setBoa(boa);
		e.setBonus(bonus);
		System.out.println("employee : "+e.getBonus());
		EmployeeMain obj = new EmployeeMain();
		int monthlySalary =obj.monthlySalary(e);
		System.out.println("Monthly salary is : "+monthlySalary);
	
			}
 private int monthlySalary(employee e) {
	 int sum = e.getBasic()+e.getBoa()+e.getBonus();
	 	 return sum;
  }
 
}