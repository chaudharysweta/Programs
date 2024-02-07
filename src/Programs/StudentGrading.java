package Programs;
import java.util.Scanner;

public class StudentGrading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for 5 subjects
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Validate marks within the range (0 to 100)
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Marks must be between 0 and 100.");
                System.out.print("Re-enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
        }

        // Calculate total score
        int totalScore = 0;
        for (int mark : marks) {
            totalScore += mark;
        }

        // Find grade based on custom grading criteria
        char grade = calculateGrade(totalScore);

        // Display results
        System.out.println("Total Score: " + totalScore);
        System.out.println("Grade: " + grade);
    }

    static char calculateGrade(int totalScore) {
        // Define custom grading criteria
        if (totalScore >= 450) {
            return 'A';
        } else if (totalScore >= 400) {
            return 'B';
        } else if (totalScore >= 350) {
            return 'C';
        } else if (totalScore >= 300) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
