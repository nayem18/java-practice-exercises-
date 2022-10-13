// 3.Write a Java program that takes two numbers and display the product of two numbers

import java.util.Scanner;

public class MultiplyTowNumbers3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the number2: ");
        int number2 = sc.nextInt();
        sc.close();

        System.out.println("Product of tow numbers: "+number1 +" x "+number2+"="+number1*number2);
    }
}
