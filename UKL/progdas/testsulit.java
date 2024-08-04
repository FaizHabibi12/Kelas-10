import java.util.Scanner;

public class testsulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] scores = new int[numStudents];
        int sum = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
            sum += scores[i];
        }

        double average = (double) sum / numStudents;

        System.out.println("Average score: " + average);

        input.close();
    }
}
