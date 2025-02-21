package Buoi1;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter your date of birth: ");
        String dob = new Scanner(System.in).nextLine();
        System.out.println("Where are you from: ");
        String from = new Scanner(System.in).nextLine();
        System.out.println("What is your school: ");
        String school = new Scanner(System.in).nextLine();

        System.out.println("Hello! my name is: " + name+" My date of birth is: " + dob+" I am from: " + from+" My school is: " + school);
    }
}
