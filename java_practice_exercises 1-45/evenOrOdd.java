// 1. Java program to check whether the given number is even or odd
import java.util.Scanner;

public class evenOrOdd{
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int x = number%2;

        if(x== 0){
            System.out.println("This is even number.");
        }
        else{
            System.out.println("This is odd number.");
        }
    }
}