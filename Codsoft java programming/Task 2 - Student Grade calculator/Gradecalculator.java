import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = 0;
        boolean validInput = false;

        // Get number of subjects with input validation
        while (!validInput) {
            try {
                System.out.print("Enter the number of subjects: ");
                numSubjects = Integer.parseInt(scanner.nextLine());
                if (numSubjects <= 0) {
                    System.out.println("Number of subjects must be positive. Please try again.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number for the number of subjects.");
            }
        }

        int totalMarks = 0;
        int maxMarksPerSubject = 100; // Assuming each subject is out of 100

        // Get marks for each subject with input validation
        for (int i = 1; i <= numSubjects; i++) {
            validInput = false;
            while (!validInput) {
                try {
                    System.out.printf("Enter marks for subject %d (out of %d): ", i, maxMarksPerSubject);
                    int marks = Integer.parseInt(scanner.nextLine());

                    if (marks < 0 || marks > maxMarksPerSubject) {
                        System.out.println("Marks must be between 0 and " + maxMarksPerSubject + ". Please try again.");
                    } else {
                        totalMarks += marks;
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a whole number for marks.");
                }
            }
        }


        double percentage = (double) totalMarks / (numSubjects * maxMarksPerSubject) * 100;

        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }


        System.out.println("--- Result ---");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * maxMarksPerSubject));
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

