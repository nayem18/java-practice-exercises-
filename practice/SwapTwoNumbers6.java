// 6.Write a Java program to swap two variables

public class SwapTwoNumbers6 {
    public static void main(String[] args){
        int num1,num2,temp;
        num1 = 10;
        num2 = 20;
        System.out.println("Befor the swaping numbers: "+ num1+", "+ + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After the swaping numbers: "+num1+", "+ + num2);
    }
}
