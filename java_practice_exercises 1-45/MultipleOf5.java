// 7. Java program to check whether the given integer is a multiple of 5

import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args){
        // input number 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = Integer.parseInt(scanner.nextLine());

        // multiple
        if(number%5==0){
            System.out.print(number + " is a multiple of 5");
        }else{
            System.out.print(number + " is not a multiple of 5");
        }
    }
}
