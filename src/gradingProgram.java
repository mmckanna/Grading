import java.util.Scanner;
import java.util.Vector;

public class gradingProgram {

	public static void main(String[] args) {
		
		//declare double variables
		double student1ExamGrade;
		double student2ExamGrade;
		double student3ExamGrade;
		double student4ExamGrade;
		double student5ExamGrade;
		double student6ExamGrade;
		double student7ExamGrade;
		double student8ExamGrade;
		double student9ExamGrade;
		double student10ExamGrade;
		double student1AssignmentGrade;
		double student2AssignmentGrade;
		double student3AssignmentGrade;
		double student4AssignmentGrade;
		double student5AssignmentGrade;
		double student6AssignmentGrade;
		double student7AssignmentGrade;
		double student8AssignmentGrade;
		double student9AssignmentGrade;
		double student10AssignmentGrade;
		
		//call methods
		greeting();
		student1ExamGrade = student1Exams();
		student2ExamGrade = student2Exams();
		student3ExamGrade = student3Exams();
		student4ExamGrade = student4Exams();
		student5ExamGrade = student5Exams();
		student6ExamGrade = student6Exams();
		student7ExamGrade = student7Exams();
		student8ExamGrade = student8Exams();
		student9ExamGrade = student9Exams();
		student10ExamGrade = student10Exams();
		student1AssignmentGrade = student1Assignments();
		student2AssignmentGrade = student2Assignments();
		student3AssignmentGrade = student3Assignments();
		student4AssignmentGrade = student4Assignments();
		student5AssignmentGrade = student5Assignments();
		student6AssignmentGrade = student6Assignments();
		student7AssignmentGrade = student7Assignments();
		student8AssignmentGrade = student8Assignments();
		student9AssignmentGrade = student9Assignments();
		student10AssignmentGrade = student10Assignments();
		
		//declare String variables
		String finalGrade1;
		String finalGrade2;
		String finalGrade3;
		String finalGrade4;
		String finalGrade5;
		String finalGrade6;
		String finalGrade7;
		String finalGrade8;
		String finalGrade9;
		String finalGrade10;
		
		//declare int variables
		int student1Grade = student1Grades(student1ExamGrade, student1AssignmentGrade);
		int student2Grade = student2Grades(student2ExamGrade, student2AssignmentGrade);
		int student3Grade = student3Grades(student3ExamGrade, student3AssignmentGrade);
		int student4Grade = student4Grades(student4ExamGrade, student4AssignmentGrade);
		int student5Grade = student5Grades(student5ExamGrade, student5AssignmentGrade);
		int student6Grade = student6Grades(student6ExamGrade, student6AssignmentGrade);
		int student7Grade = student7Grades(student7ExamGrade, student7AssignmentGrade);
		int student8Grade = student8Grades(student8ExamGrade, student8AssignmentGrade);
		int student9Grade = student9Grades(student9ExamGrade, student9AssignmentGrade);
		int student10Grade = student10Grades(student10ExamGrade, student10AssignmentGrade);
		
		//Creates a vector to store the students grades.
		Vector<Integer> studentScores = new Vector<Integer>(10);
		studentScores.addElement(student1Grade);
		studentScores.addElement(student2Grade);
		studentScores.addElement(student3Grade);
		studentScores.addElement(student4Grade);
		studentScores.addElement(student5Grade);
		studentScores.addElement(student6Grade);
		studentScores.addElement(student7Grade);
		studentScores.addElement(student8Grade);
		studentScores.addElement(student9Grade);
		studentScores.addElement(student10Grade);
		
		int studentAverages = studentAverage(student1Grade, student2Grade, student3Grade, student4Grade, student5Grade, student6Grade, student7Grade, student8Grade, student9Grade, student10Grade);
		int standardDeviation = standardDeviationCaluclation(student1Grade, student2Grade, student3Grade, student4Grade, student5Grade, student6Grade, student7Grade, student8Grade, student9Grade, student10Grade);
		
		finalGrade1 = printGrade1(student1Grade, studentAverages, standardDeviation);
		finalGrade2 = printGrade2(student2Grade, studentAverages, standardDeviation);
		finalGrade3 = printGrade3(student3Grade, studentAverages, standardDeviation);
		finalGrade4 = printGrade4(student4Grade, studentAverages, standardDeviation);
		finalGrade5 = printGrade5(student5Grade, studentAverages, standardDeviation);
		finalGrade6 = printGrade6(student6Grade, studentAverages, standardDeviation);
		finalGrade7 = printGrade7(student7Grade, studentAverages, standardDeviation);
		finalGrade8 = printGrade8(student8Grade, studentAverages, standardDeviation);
		finalGrade9 = printGrade9(student9Grade, studentAverages, standardDeviation);
		finalGrade10 = printGrade10(student10Grade, studentAverages, standardDeviation);
		
		
		//Displays the students final grade
		System.out.println("");
		System.out.println("***********************************************************************");
		System.out.println("**              The students final grades are below                  **");
		System.out.println("**                 Thanks for using Grading 1.0                      **");
		System.out.println("***********************************************************************");
		System.out.println("Student 1's grade: " +finalGrade1);
		System.out.println("Student 2's grade: " +finalGrade2);
		System.out.println("Student 3's grade: " +finalGrade3);
		System.out.println("Student 4's grade: " +finalGrade4);
		System.out.println("Student 5's grade: " +finalGrade5);
		System.out.println("Student 6's grade: " +finalGrade6);
		System.out.println("Student 7's grade: " +finalGrade7);
		System.out.println("Student 8's grade: " +finalGrade8);
		System.out.println("Student 9's grade: " +finalGrade9);
		System.out.println("Student 10's grade: " +finalGrade10);
		
	}	

		//Welcomes the users to the program
		public static void greeting() {
		System.out.println("***********************************************************************");
		System.out.println("**    Welcome, on the following lines, please enter the scores       **");
		System.out.println("**  Each student will require four scores for exams and assignements.**");
		System.out.println("**                Press enter after each score...                    **");
		System.out.println("***********************************************************************");
		System.out.println("");
		}
		
		//Calculates the students exams together
		static int student1Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 1's exam scores:");
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
		}
		
		static int student2Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 2's exam scores:");
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
		}
		
		static int student3Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 3's exam scores:");
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
		}
		
		static int student4Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 4's exam scores:");
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student5Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 5's exam scores:");				
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student6Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 6's exam scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student7Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 7's exam scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student8Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 8's exam scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student9Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 9's exam scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student10Exams() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 10's exam scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		//Calculates the students assignments together. 
		static int student1Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 1's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student2Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 2's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student3Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 3's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student4Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 4's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student5Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 5's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student6Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 6's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student7Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 7's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student8Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 8's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student9Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 9's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}
		
		static int student10Assignments() {
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter the Student 10's assignment scores:");						
			int a;
			int b;
			int c;
			int d;
			int z;
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			z = (a+b+c+d);
			return z;
			}	
		
		//Calculates the students point total
		static int student1Grades(double student1Exam, double student1Assignment){
			int z;
			z = (int) (student1Exam + student1Assignment);
			return z;
		}
		static int student2Grades(double student2Exam, double student2Assignment){
			int z;
			z = (int) (student2Exam + student2Assignment);
			return z;
		}
		static int student3Grades(double student3Exam, double student3Assignment){
			int z;
			z = (int) (student3Exam + student3Assignment);
			return z;
		}
		static int student4Grades(double student4Exam, double student4Assignment){
			int z;
			z = (int) (student4Exam + student4Assignment);
			return z;
		}
		static int student5Grades(double student5Exam, double student5Assignment){
			int z;
			z = (int) (student5Exam + student5Assignment);
			return z;
		}
		static int student6Grades(double student6Exam, double student6Assignment){
			int z;
			z = (int) (student6Exam + student6Assignment);
			return z;
		}
		static int student7Grades(double student7Exam, double student7Assignment){
			int z;
			z = (int) (student7Exam + student7Assignment);
			return z;
		}
		static int student8Grades(double student8Exam, double student8Assignment){
			int z;
			z = (int) (student8Exam + student8Assignment);
			return z;
		}
		static int student9Grades(double student9Exam, double student9Assignment){
			int z;
			z = (int) (student9Exam + student9Assignment);
			return z;
		}
		static int student10Grades(double student10Exam, double student10Assignment){
			int z;
			z = (int) (student10Exam + student10Assignment);
			return z;
		}
		
		//Calculate the standard deviation
		
		static int standardDeviationCaluclation(int student1Grade, int student2Grade, int student3Grade, int student4Grade, int student5Grade, int student6Grade, int student7Grade, int student8Grade, int student9Grade, int student10Grade) {
			int mean = ((student1Grade + student2Grade + student3Grade + student4Grade + student5Grade + student6Grade + student7Grade + student8Grade + student9Grade + student10Grade)/10);
			int varianceTotal;
			int deviation;
			int variance1 = (int) Math.pow(student1Grade - mean, 2);
			int variance2 = (int) Math.pow(student2Grade - mean, 2);
			int variance3 = (int) Math.pow(student3Grade - mean, 2);
			int variance4 = (int) Math.pow(student4Grade - mean, 2);
			int variance5 = (int) Math.pow(student5Grade - mean, 2);
			int variance6 = (int) Math.pow(student6Grade - mean, 2);
			int variance7 = (int) Math.pow(student7Grade - mean, 2);
			int variance8 = (int) Math.pow(student8Grade - mean, 2);
			int variance9 = (int) Math.pow(student9Grade - mean, 2);
			int variance10 = (int) Math.pow(student10Grade - mean, 2);
			varianceTotal = ((variance1 + variance2 + variance3 + variance4 + variance5 + variance6 + variance7 + variance8 + variance9 + variance10)/10);
			deviation =  (int) Math.sqrt(varianceTotal);
			return deviation;
		}
		
		static int studentAverage (int student1Grade,int student2Grade,int student3Grade, int student4Grade,int student5Grade, int student6Grade, int student7Grade, int student8Grade, int student9Grade, int student10Grade) {
			int average = ((student1Grade + student2Grade + student3Grade + student4Grade + student5Grade + student6Grade + student7Grade + student8Grade + student9Grade + student10Grade)/10);
			return average;
			
		}
		
		//Calculate the students final grade
		public static String printGrade1(int student1Grade, int studentAverages, int standardDeviation) {
			int a = ((studentAverages) + (2 * standardDeviation));
			int b = ((studentAverages) + (1 * standardDeviation));
			int c = (studentAverages);
			int d = ((studentAverages) - (1 * standardDeviation));
			if (student1Grade >= a)
				return "A";
			else if (student1Grade >= b)
				return "B";
			else if (student1Grade >= c)
				return "C";
			else if (student1Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade2(int student2Grade, int studentAverages, int standardDeviation) {
			int a = ((studentAverages) + (2 * standardDeviation));
			int b = ((studentAverages) + (1 * standardDeviation));
			int c = (studentAverages);
			int d = ((studentAverages) - (1 * standardDeviation));
			if (student2Grade >= a)
				return "A";
			else if (student2Grade >= b)
				return "B";
			else if (student2Grade >= c)
				return "C";
			else if (student2Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade3(int student3Grade, int studentAverage, int standardDeviation) {
			int a = ((studentAverage) + (2 * standardDeviation));
			int b = ((studentAverage) + (1 * standardDeviation));
			int c = (studentAverage);
			int d = ((studentAverage) - (1 * standardDeviation));
			if (student3Grade >= a)
				return "A";
			else if (student3Grade >= b)
				return "B";
			else if (student3Grade >= c)
				return "C";
			else if (student3Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade4(int student4Grade, int studentAverages, int standardDeviation) {
			int a = ((studentAverages) + (2 * standardDeviation));
			int b = ((studentAverages) + (1 * standardDeviation));
			int c = (studentAverages);
			int d = ((studentAverages) - (1 * standardDeviation));
			if (student4Grade >= a)
				return "A";
			else if (student4Grade >= b)
				return "B";
			else if (student4Grade >= c)
				return "C";
			else if (student4Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade5(int student5Grade, int studentAverage, int standardDeviation) {
			int a = ((studentAverage) + (2 * standardDeviation));
			int b = ((studentAverage) + (1 * standardDeviation));
			int c = (studentAverage);
			int d = ((studentAverage) - (1 * standardDeviation));
			if (student5Grade >= a)
				return "A";
			else if (student5Grade >= b)
				return "B";
			else if (student5Grade >= c)
				return "C";
			else if (student5Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade6(int student6Grade, int studentAverage, int standardDeviation) {
			int a = ((studentAverage) + (2 * standardDeviation));
			int b = ((studentAverage) + (1 * standardDeviation));
			int c = (studentAverage);
			int d = ((studentAverage) - (1 * standardDeviation));
			if (student6Grade >= a)
				return "A";
			else if (student6Grade >= b)
				return "B";
			else if (student6Grade >= c)
				return "C";
			else if (student6Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade7(int student7Grade, int studentAverage, int standardDeviation) {
			int a = ((studentAverage) + (2 * standardDeviation));
			int b = ((studentAverage) + (1 * standardDeviation));
			int c = (studentAverage);
			int d = ((studentAverage) - (1 * standardDeviation));
			if (student7Grade >= a)
				return "A";
			else if (student7Grade >= b)
				return "B";
			else if (student7Grade >= c)
				return "C";
			else if (student7Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade8(int student8Grade, int studentAverage, int standardDeviation) {
			int a = ((studentAverage) + (2 * standardDeviation));
			int b = ((studentAverage) + (1 * standardDeviation));
			int c = (studentAverage);
			int d = ((studentAverage) - (1 * standardDeviation));
			if (student8Grade >= a)
				return "A";
			else if (student8Grade >= b)
				return "B";
			else if (student8Grade >= c)
				return "C";
			else if (student8Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade9(int student9Grade, int studentAverage, int standardDeviation) {
			int a = ((studentAverage) + (2 * standardDeviation));
			int b = ((studentAverage) + (1 * standardDeviation));
			int c = (studentAverage);
			int d = ((studentAverage) - (1 * standardDeviation));
			if (student9Grade >= a)
				return "A";
			else if (student9Grade >= b)
				return "B";
			else if (student9Grade >= c)
				return "C";
			else if (student9Grade >=d)
				return "D";
			else 
				return "F";
		}
		
		public static String printGrade10(int student10Grade, int studentAverage, int standardDeviation) {
			int a = ((studentAverage) + (2 * standardDeviation));
			int b = ((studentAverage) + (1 * standardDeviation));
			int c = (studentAverage);
			int d = ((studentAverage) - (1 * standardDeviation));
			if (student10Grade >= a)
				return "A";
			else if (student10Grade >= b)
				return "B";
			else if (student10Grade >= c)
				return "C";
			else if (student10Grade >=d)
				return "D";
			else 
				return "F";
			}
}

