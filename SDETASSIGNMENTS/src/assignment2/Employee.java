package assignment2;

public class Employee {
	double basic;
	double boa;
	double bonus;
	double add;
	double pf;
	double monthTaxable;
	double yearTaxable;
	double yearTax;
	double tax;
	double monthTax;
	double monthIncome;
	public Employee(int a,int b,int c) {
		basic=a;
		boa=b;
		bonus=c;
	}
	
	public double monthlySalary() {
		add = basic+boa+bonus;
		System.out.println("Monthly Salary is : " +add);
		return add;
	}
   public double pfcal() {
	   pf =basic*0.12;
	   System.out.println("PF is             : " +pf);
	   return pf;
   }
   public double monthlyTaxable() {
		monthTaxable = add-pf;
		System.out.println("Monthly Taxable is   : " +monthTaxable);
		return monthTaxable;
	}
   public double yearlyTaxable() {
		yearTaxable =monthTaxable*12 ;
		System.out.println("Yearly Taxable is   : " +yearTaxable);
		return yearTaxable;
	}
   public double yearlyTax() {
		if (yearTaxable<=250000) {
			System.out.println("No Tax Required");
			
		} else if (yearTaxable>=250000&&yearTaxable<=500000){
			tax= yearTaxable*0.05;
			System.out.println("Tax appliable is   : "+tax);
		 }else if (yearTaxable>=500000&&yearTaxable<=750000){
			tax= yearTaxable*0.10;
			System.out.println("Tax appliable is   : "+tax);
	     } else if (yearTaxable>=750000&&yearTaxable<=1000000){
		    tax= yearTaxable*0.15;
		   System.out.println("Tax appliable is   : "+tax);
	    }else if (yearTaxable>=1000000&&yearTaxable<=1250000){
		  tax= yearTaxable*0.20;
		  System.out.println("Tax appliable is   : "+tax);
	     }else if (yearTaxable>=1250000&&yearTaxable<=1500000){
		    tax= yearTaxable*0.25;
		   System.out.println("Tax appliable is   : "+tax);
			  
	    }else
	    	tax = yearTaxable*.30;
		  System.out.println("Tax appliable is    : "+tax);
		  return tax;
      }
   
   public double monthlyTax() {
		monthTax = tax/12;
		System.out.println("Monthly Tax is    : " +monthTax);
		return monthTax;
	}
   public double monthlyTakeHome() {
		monthIncome = monthTaxable-monthTax;
		System.out.println("Monthly income is    : " +monthIncome);
		return monthIncome;
	}
   public static void main(String[] args) {
	   
	   System.out.println("\tEmployee 1 salary details");
	   System.out.println("\t-------------------------");
	Employee emp1 = new Employee(8000,16000,3000);
	  emp1.monthlySalary();
	  emp1.pfcal();
	  emp1.monthlyTaxable();
	  emp1.yearlyTaxable();
	  emp1.yearlyTax();
	  emp1.monthlyTax();
	  emp1.monthlyTakeHome();
	  System.out.println();
	  System.out.println("\tEmployee 2 salary details");
	  System.out.println("\t-------------------------");
	Employee emp2 = new Employee(100000,70000,2500);
	  emp2.monthlySalary();
	  emp2.pfcal();
	  emp2.monthlyTaxable();
	  emp2.yearlyTaxable();
	  emp2.yearlyTax();
	  emp2.monthlyTax();
	  emp2.monthlyTakeHome();
	  System.out.println();
	  System.out.println("\tEmployee 3 salary details");
	  System.out.println("\t-------------------------");
	Employee emp3 = new Employee(12000,9000,3000);
	  emp3.monthlySalary();
	  emp3.pfcal();
	  emp3.monthlyTaxable();
	  emp3.yearlyTaxable();
	  emp3.yearlyTax();
	  emp3.monthlyTax();
	  emp3.monthlyTakeHome();
	  System.out.println();
	  System.out.println("\tEmployee 4 salary details");
	  System.out.println("\t-------------------------");
	Employee emp4 = new Employee(15000,10000,3500);
	  emp4.monthlySalary();
	  emp4.pfcal();
	  emp4.monthlyTaxable();
	  emp4.yearlyTaxable();
	  emp4.yearlyTax();
	  emp4.monthlyTax();
	  emp4.monthlyTakeHome();
	
  }
  }
