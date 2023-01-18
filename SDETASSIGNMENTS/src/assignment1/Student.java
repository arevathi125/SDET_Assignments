package assignment1;

public class Student {
	int eng_marks;
	int math_marks;
	int sci_marks;
	int sst_marks;
	int sum;
	float avg;
public int totalMarks() {
	sum = eng_marks+math_marks+sci_marks+sst_marks;
	System.out.println("  Total Mark is : " +sum);
	return sum;
	
}
public float average() {
	avg = sum/4;
	System.out.println("  Average is    : "+avg);
	System.out.println( );
	return avg;
}
public static void main(String[] args) {
	Student stud1 = new Student();
	Student stud2 = new Student();
	Student stud3 = new Student();
	Student stud4 = new Student();
		
	System.out.println("\tCalculating for student1");
	System.out.println("\t------------------------");
	stud1.eng_marks = 60;
	stud1.math_marks = 50;
	stud1.sci_marks = 70;
	stud1.sst_marks = 80;
	stud1.totalMarks();
	stud1.average();
	System.out.println("\tCalculating for student2");
	System.out.println("\t------------------------");
	stud2.eng_marks = 80;
	stud2.math_marks = 50;
	stud2.sci_marks = 40;
	stud2.sst_marks = 90;
	stud2.totalMarks();
	stud2.average();
	System.out.println("\tCalculating for student3");
	System.out.println("\t------------------------");
	stud3.eng_marks = 60;
	stud3.math_marks = 70;
	stud3.sci_marks = 40;
	stud3.sst_marks = 50;
	stud3.totalMarks();
	stud3.average();
	System.out.println("\tCalculating for student4");
	System.out.println("\t------------------------");
	stud4.eng_marks = 90;
	stud4.math_marks = 80;
	stud4.sci_marks = 60;
	stud4.sst_marks = 70;
	stud4.totalMarks();
	stud4.average(); 
	
	
}

}