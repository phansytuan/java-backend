package Buoi2;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a: ");
        double a = sc.nextInt();
        System.out.println("nhập số b: ");
        double b = sc.nextInt();
        double x=0;
        if(a==0 && b==0){
            System.out.println("pt có vô số nghiệm.");
        }
        else if(a==0 && b!=0){
            System.out.println("pt vô nghiệm.");
        }
        else{
            x=-b/a;
            System.out.println("nghiệm x là: "+x);
        }
    }
}
