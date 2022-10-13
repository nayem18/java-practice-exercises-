// 7.Write a Java program to convert a decimal number to binary numbers

import java.util.Scanner;

public class DecimalToBinary7 {
    public static void main(String[] args){
        int decimal_num, quot, i=1, j;
        int bin_num[]= new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        decimal_num = scan.nextInt();
        scan.close();
        quot = decimal_num;

        while(quot != 0){
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
        System.out.print("Binary number is: ");
        for(j=i-1;j>0;j--){
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
