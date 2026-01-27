import java.util.Scanner;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("No. of Courses: ");
        int no_Courses = sc.nextInt();

        int totalCreditsTaken = 0;
        int totalCreditsEarned = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= no_Courses; i++) {
            System.out.println("COURSE " + i + ":");

            System.out.print("Credit (Max 3): ");
            int credit = sc.nextInt();
            totalCreditsTaken += credit;

            System.out.print("CT (Max 30): ");
            int ct = sc.nextInt();

            System.out.print("AT (Max 10): ");
            int at = sc.nextInt();

            System.out.print("FE (Max 60): ");
            int fe = sc.nextInt();
        
            int totalMarks = ct + at + fe;

            double gradePoint = 0;
            if (totalMarks >= 80) gradePoint = 4.00;
            else if (totalMarks >= 75) gradePoint = 3.75;
            else if (totalMarks >= 70) gradePoint = 3.50;
            else if (totalMarks >= 65) gradePoint = 3.25;
            else if (totalMarks >= 60) gradePoint = 3.00;
            else if (totalMarks >= 55) gradePoint = 2.75;
            else if (totalMarks >= 50) gradePoint = 2.50;
             else if (totalMarks >= 45) gradePoint = 2.25;
             else if (totalMarks >= 40) gradePoint = 2.00;
             else gradePoint = 0;

            totalGradePoints += gradePoint * credit;

            if (totalMarks >= 40) {
                totalCreditsEarned += credit;
            }
        }

        double cgpa = totalGradePoints / totalCreditsTaken;

        String grade = "";
        if (cgpa >= 4) grade = "A+";
        else if (cgpa >= 3.75) grade = "A";
         else if (cgpa >= 3.50) grade = "A-";
        else if (cgpa >= 3.25) grade = "B+";
        else if (cgpa >= 3.00) grade = "B";
        else if (cgpa >= 2.75) grade = "B-";
        else if (cgpa >= 2.50) grade = "C+";
         else if (cgpa >= 2.25) grade = "C";
          else if (cgpa >= 2.00) grade = "D";
        else grade = "F";

        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + totalCreditsTaken);
        System.out.println("Credit Earned: " + totalCreditsEarned);
        System.out.printf("CGPA: %.2f%n", cgpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
