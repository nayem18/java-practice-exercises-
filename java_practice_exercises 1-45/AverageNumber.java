// 4. Java program to find out the average of a set of integers

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args){
        // How many number count
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many number count: ");
        // input user
        int count = Integer.parseInt(scanner.nextLine());
        int i = 1;
        float sum = 0;

        // input number
        for(i=1;i<=count;i++){
            System.out.print(i +". Enter a number: ");
            int x = Integer.parseInt(scanner.nextLine());
            sum = sum + x;
        }

        // Average calculation
        float avg = sum/count;
        System.out.println("Some number of average: " + avg);

    }
}
