// 8. Java program to check whether the given integer is a multiple of both 5 and 7

import java.util.Scanner;

public class MultipleOf5And7 {
    public static void main(String[] args){
        // input number 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Integer.parseInt(scanner.nextLine());

        // multiple
        if((number%5==0)&&(number%7==0)){
            System.out.print(number + " is a multiple of both 5 and 7");
        }else{
            System.out.print(number + "is not a multiple of both 5 and 7");
        }
    }
}
