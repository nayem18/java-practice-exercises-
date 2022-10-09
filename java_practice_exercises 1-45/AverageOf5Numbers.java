// 9. Java program to find the average of 5 numbers using while loop

import java.util.Scanner;

public class AverageOf5Numbers {
    public static void main(String[] args) {
        // define the value
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the five number.");

        // while loop for input 5 numbers.
        while(count<5){
            System.out.print("Enter the number: ");
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
            count++;
        }
        // avarege
        double avg = ((double)sum)/5.0;
        System.out.println("Average of 5 number is: " + avg);
    }
    
}