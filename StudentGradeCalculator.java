import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========== Welcome to the Student Grade Calculator ===========");
        System.out.println("Enter The Number Of Grades:");
        int grades = sc.nextInt();
        
        int[] arr = new int[grades];
        
        int total = 0;
        
        for (int i = 0; i < grades; i++) {
            System.out.println("Enter The Grade Marks:");
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        
        double avg = (double) total / grades;
        System.out.println("Your Average of Grades is: " + avg);
    }
}