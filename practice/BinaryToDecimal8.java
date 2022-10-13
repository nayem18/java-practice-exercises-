// 8.Write a Java program to convert a binary number to decimal number

import java.util.Scanner;

public class BinaryToDecimal8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long bin_num, decimal_num = 0, j= 1, rem;
        System.out.print("Enter a binary number: ");
        bin_num = scan.nextLong();
        scan.close();

        while (bin_num != 0) 
        {
         rem = bin_num % 10;
         decimal_num = decimal_num + rem * j;
         j = j * 2;
         bin_num = bin_num / 10;
        }
        System.out.println("Decimal Number: " + decimal_num);
    }
}
