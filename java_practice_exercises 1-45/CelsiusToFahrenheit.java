//2. Java program to convert the temperature in Degree Centigrade to Fahrenheit

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner cs = new Scanner(System.in);
        int c = Integer.parseInt(cs.nextLine());
        float f = ((9*c)/5+32);

        System.out.print("Temperature in fahrenheit is : " + f);

    }
}
