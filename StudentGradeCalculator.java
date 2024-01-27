package bhagya;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        final double SUM_TOTAL = 100.0;

        System.out.print("Provide marks for Subject 1: ");
        double marks1 = grade.nextDouble();

        System.out.print("Provide marks for Subject 2: ");
        double marks2 = grade.nextDouble();

        System.out.print("Provide marks for Subject 3: ");
        double marks3 = grade.nextDouble();
        
        System.out.print("Provide marks for Subject 4: ");
        double marks4 = grade.nextDouble();
        
        System.out.print("Provide marks for Subject 5: ");
        double marks5 = grade.nextDouble();
        
        System.out.println("Provide marks for Subject 6: ");
        double marks6 = grade.nextDouble();
        
        double GrandTotal = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        double standardPercentage = (GrandTotal / (6 * SUM_TOTAL)) * 100;
        
        System.out.println("Your Total Marks are : " + GrandTotal);
        System.out.println("Your Average Percentage is : " + standardPercentage + " % ");

        if (GrandTotal >= 90) {
            System.out.println("Your Acquired Rank is: A");
        } else if (GrandTotal >= 80) {
            System.out.println("Your Acuqired Rank is: B");
        } else if (GrandTotal >= 70) {
            System.out.println("Your Acquired Rank is: C");
        } else if (GrandTotal >= 60) {
            System.out.println("Your Acquired Rank is: D");
        } else {
            System.out.println("Your Acquired Rank is: F");
        }

        grade.close();
    }
}
