// 5. Java program to find the product of a set of real numbers

import java.util.Scanner;

public class ProductRealNumber {
    public static void main(String[] args){
        // input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of real numbers: ");
        int count = Integer.parseInt(scanner.nextLine());
        int i= 1;
        float product = 1.0f;
        for(i=1;i<=count;i++){
            // input real number
            System.out.print(i +".Enter a real number: ");
            Float x = Float.parseFloat(scanner.nextLine());
            product = product * x;
        }
        System.out.print("The product of the numbers is: " + product);


    }
}
