// 6. Java program to find the circumference and area of a circle with a given radius

import java.util.Scanner;

public class CircumferenceArea {
    public static void main(String[] args){
        // input radius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eenter the radius: ");
        double radius = Float.parseFloat(scanner.nextLine());

        // circumference formula
        double c = 2 * Math.PI * radius;
        // area of a circle formula
        double area = Math.PI * radius*radius;

        System.out.print("Circumfence is: " + c);
        System.out.println("Area of a circle: " + area);
    }
}
