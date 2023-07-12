import java.util.Scanner;

public class SemesterMarksAveragerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 8 sem marks");
		
		
		
		System.out.printf("%.2f\n",SemesterMarksAverager.calculateAverage(85, 79, 91, 76, 88, 95, 80, 85));
		System.out.printf("%.2f",SemesterMarksAverager.calculateAverage(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()));
	    scan.close();
	}

}
