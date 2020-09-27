import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of students to enroll: ");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] student = new Student[numOfStudents];
        for (int n = 0; n < numOfStudents; n++) {
            student[n] = new Student();
            student[n].enroll();
            student[n].payTution();
            System.out.println(student[n].toString());
        }
    }
}

