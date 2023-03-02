package baiTapVeNha;

import java.util.Scanner;

public class Cau82_in_List_1000 {
    public static void main(String[] args) {
        //viet chuong trinh tim so lon nhat trong 3 so thuc a b c
        //input a b c
        //output max=??

        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap 3 so a, b, c (a!=b!=c) :  ");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        in.close();

        if (a==b || b==c || a== c){
            System.out.printf("Nhap lai: ");
            System.exit(0);
        }

        double max;
        if(a>b && a >c){
            max=a;
            System.out.printf("max la %.2f",max);
            System.exit(0);
        }
        if(b>a && b >c){
            max=b;
            System.out.printf("max la %.2f",max);
            System.exit(0);
        }
        if(c>a && c>b){
            max=c;
            System.out.printf("max la %.2f",max);
            System.exit(0);
        }



    }
}
