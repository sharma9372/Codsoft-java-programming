import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");

        int numsSubject = sc.nextInt();

        int totalMarks = 0;
        for(int i = 1; i<=numsSubject; i++) {
            System.out.println("Enter the marks of subjects: ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double avgPercentage = (double) totalMarks / (numsSubject * 100) * 100;
        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        }
        else if(avgPercentage >= 80) {
            grade = 'B';
        }
        else if(avgPercentage >= 70) {
            grade = 'C';
        }
        else if(avgPercentage >= 60) {
            grade = 'D';
        }
        else if(avgPercentage >= 50) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        System.out.println("----------Result-----------");
        System.out.println("Total Marks: "+ totalMarks);
        System.out.println("Average Percentage: "+  avgPercentage+ "%");
        System.out.println("Grade: "+ grade);
    }
}
