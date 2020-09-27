import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student first name:");
        this.firstName = scanner.nextLine();
        System.out.println("Enter Student second name:");
        this.lastName = scanner.nextLine();
        System.out.println("1. Freshmen\n2. Sophmore\n3. Junior\n4. Senior\nEnter Student Class Level:");
        this.gradeYear = scanner.nextInt();
        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit)");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    public void viewBalance() {
        System.out.println("your balance is : " +tuitionBalance);
    }

    public void payTution() {
        viewBalance();
        System.out.println("Enter your payment:");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent Id: " + studentId +
                "\nCourse Enrolled:" + courses +
                "\nBalance: " + tuitionBalance;
    }
}
