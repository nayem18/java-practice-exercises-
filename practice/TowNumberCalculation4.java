// 4.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers

import java.util.Scanner;

public class TowNumberCalculation4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        //close the input
        scanner.close();

        double sum = num1+num2;
        double multiply = num1*num2;
        double subtract = num1-num2;
        double divide = num1/num2;
        double remainder = num1%num2;

        System.out.println("Tow number of sum: "+ sum);
        System.out.println("Tow numbers of multiply: "+ multiply);
        System.out.println("Tow numbers of subtraction: "+ subtract);
        System.out.println("Tow numbers of divide: "+ divide);
        System.out.println("Tow numbers of remainder: "+ remainder);

    }
}
