import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");

        int totalMarks = 0;
        int numSubjects;
        int[] subjectMarks;

        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();
        subjectMarks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
            totalMarks += subjectMarks[i];
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Grade Calculation
        String grade = calculateGrade(averagePercentage);

        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
