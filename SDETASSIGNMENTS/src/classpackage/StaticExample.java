package classpackage;

public class StaticExample {
	
	// creating variables as statics
	
	static char grade;
	static int gradeA;
	static int gradeB;
	static int gradeC;
	static int gradeD;
	static int gradeE;
	static int gradeF;
	
	// IN STATIC METHOD WE CANNOT CREATE A CONSTRUCTOR
	
	static {
		
		System.out.println("I am inside the static block");
		gradeA = 1;
		gradeB = 2;
		gradeC = 3;
		gradeD = 4;
		gradeE = 5;
		gradeF = 1;
	}
	
	// creating static method
	
       public static void calculateGrade(int avg) {
    	   if (avg >= 90) {grade ='A';gradeA = gradeA+1;}
		 else if (avg >= 80&& avg <90){grade ='B';gradeB = gradeB+1;}
		 else if (avg >= 70&& avg <80){grade ='C';gradeB = gradeC+1;}
		 else if (avg >= 60&& avg <70){grade ='D';gradeB = gradeD+1;}
		 else if (avg >= 50&& avg <60){grade ='E';gradeB = gradeE+1;}
		 else {grade ='F';gradeB = gradeF+1;}
    	   System.out.println("Average Mark Of The Student Is : "+avg);
    	   System.out.println("student Got  : " + grade + " Garde");
       }
		public static void main(String[] args) {
			calculateGrade(50);
			calculateGrade(90);
			
			System.out.println("Number Of Students With GradeA : " +gradeA);
			System.out.println("Number Of Students With GradeB : " +gradeB);
			System.out.println("Number Of Students With GradeC : " +gradeC);
			System.out.println("Number Of Students With GradeD : " +gradeD);
			System.out.println("Number Of Students With GradeE : " +gradeE);
			System.out.println("Number Of Students With GradeF : " +gradeF);
			
		}
    	   

       }
      
     

