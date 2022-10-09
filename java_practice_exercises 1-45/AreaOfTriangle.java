//3. Java program to find the area of a triangle whose three sides are given

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st side: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the 2nd side: ");
        float b = scanner.nextFloat();

        System.out.print("Enter the 3rd side: ");
        float c = scanner.nextFloat();

        if((a+b)>c && (a+c)>b && (b+c)>a){
            // semi-perimeter
            double s = (a+b+c)/2.0;
            // area of triangle
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.print("Area of triangle is: " + area);
        }else {
            System.out.print("This is not a triangle.");
        }
    }
}
