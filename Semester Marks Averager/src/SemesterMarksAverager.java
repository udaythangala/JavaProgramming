import java.util.Scanner;

public class SemesterMarksAverager {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks of all sem's :");
	int sem1 = sc.nextInt();
	int sem2 = sc.nextInt();
	int sem3 = sc.nextInt();
	int sem4 = sc.nextInt();
	int sem5 = sc.nextInt();
	int sem6 = sc.nextInt();
	int sem7 = sc.nextInt();
	int sem8 = sc.nextInt();
	sc.close();
	System.out.printf("%.2f\n",AvgSemMarks.calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));
}

}
//85, 79, 91, 76, 88, 95, 80, 85