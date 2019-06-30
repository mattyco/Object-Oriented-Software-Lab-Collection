import java.util.Scanner;

public class Q1{
	//String name;
	//String rollNo;
	// double cgpa;

	public static double cgpaToPercent(double cgpa){
		return (cgpa-0.5)*10.0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int noStuds = in.nextInt();
		for (int i = 0;i < noStuds; i++) {

			System.out.println("Student Details:");
			String name = in.next();
			String rollNo = in.next();
			double cgpa = in.nextDouble();
			double percent = cgpaToPercent(cgpa);
			System.out.println(name+" "+rollNo+" "+percent);
		}
	}
}