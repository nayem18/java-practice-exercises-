// 5.Write a Java program that takes five numbers as input to calculate and print the average of the numbers

import java.util.Scanner;

public class AverageNumbers5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers average need: ");
        int count = Integer.parseInt(sc.nextLine());
        int i = 0;
        float sum = 0;
        
        for(i=0;i<count;i++){
            System.out.print("Enter the number: ");
            int number = Integer.parseInt(sc.nextLine());
            sum = sum + number;
        }
        //sc.close();
        double avg = sum/count;
        System.out.println("Average of five numbers: "+ avg);
    }
}