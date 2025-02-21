package Buoi1;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        System.out.println("Enter number a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter number b: ");
        int b = new Scanner(System.in).nextInt();
        int sum= a+b;
        int product = a*b;
        int quotient = a/b;
        int remainder = a%b;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Product is: " + product);
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + remainder);
    }
}
