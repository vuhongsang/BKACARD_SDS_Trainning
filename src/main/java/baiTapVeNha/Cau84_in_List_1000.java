package baiTapVeNha;

import java.util.Scanner;

public class Cau84_in_List_1000 {
    public static void main(String[] args) {
        //84. giải và biện luận phương trình ax+b=0
        // input a,b
        //output-----
        //TH1: a==b==0 Phương trình vô số nghiệm
        //th2: a==0, b!=0  phương trình vô nghiệm
        //TH3 a!=0, b!=0 phương trình có 1 nghiệm

        Scanner in = new Scanner(System.in);
        System.out.printf("nhap 2 so thuc a,b = ");
        double a=in.nextDouble();
        double b=in.nextDouble();
        in.close();

        if(a==0 && b==0){
            System.out.printf("Phương trình có vô số nghiệm");
            System.exit(0);
        }
        if(a==0 && b!=0){
            System.out.printf("Phương trình vô nghiệm");
            System.exit(0);
        }
        if(a!=0 && b!=0){
            double x=-b/a;
            System.out.printf("Phương trình %.1fx + %.1f = 0 có 1 nghiệm %.2f",a,b,x);
            System.exit(0);
        }

    }
}
