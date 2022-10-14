// 10.Write a Java program and compute the sum of the digits of an integer

import java.util.Scanner;

public class DigitsSum10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer digit: ");
        long n = input.nextLong();
        System.out.println("The sum of the digits is: "+sumDigits(n));
        input.close();
    }
    public static int sumDigits(long num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num/=10;
        }
        return sum;
    }
}
