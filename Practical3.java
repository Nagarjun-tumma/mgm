import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        // to check first number
        System.out.println("enter the first number: ");
        int num1 = input.nextInt();
        if(num1 > 0) {
            positiveCount++;
        } else if(num1 < 0 ) {
            negativeCount++;
        } else {
            zeroCount++;
        }

        // to check second number
        System.out.println("enter the second number: ");
        int num2 = input.nextInt();
        if(num2 > 0) {
            positiveCount++;
        } else if(num2 < 0 ) {
            negativeCount++;
        } else {
            zeroCount++;
        }

        // to check third number
        System.out.println("enter the third number: ");
        int num3 = input.nextInt();
        if(num3 > 0) {
            positiveCount++;
        } else if(num3 < 0 ) {
            negativeCount++;
        } else {
            zeroCount++;
        }

        // to check fourth number
        System.out.println("enter the fourth number: ");
        int num4 = input.nextInt();
        if(num4 > 0) {
            positiveCount++;
        } else if(num4 < 0 ) {
            negativeCount++;
        } else {
            zeroCount++;
        }

        // to check fifth number
        System.out.println("enter the fifth number: ");
        int num5 = input.nextInt();
        if(num5 > 0) {
            positiveCount++;
        } else if(num5 < 0 ) {
            negativeCount++;
        } else {
            zeroCount++;
        }

        // print the counts
        System.out.println("number of positive numbers: " + positiveCount);
        System.out.println("number of negative numbers: " + negativeCount);
        System.out.println("number of zeros numbers: " + zeroCount);
    }
}
