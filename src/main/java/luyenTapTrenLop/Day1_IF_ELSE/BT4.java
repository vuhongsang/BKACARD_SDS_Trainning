package luyenTapTrenLop.Day1_IF_ELSE;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        //giai phuong trinh ax+b=0 >> x=-b/a
        //TH1: a=b=0 vo so nghiem
        //TH2: a=0, b!=0 vo nghiem
        //TH3 a!=0 co 1 nghiem
        Scanner in = new Scanner(System.in);
        System.out.printf("giai phuong trinh ax+b=0");
        System.out.printf("\n nhap a va b = ");
        double a=in.nextInt();
        double b=in.nextInt();
        in.close();
        if (a==0&&b==0){
            System.out.printf("Phuong trinh vo so nghiem");
            System.exit(0);
        }
        if(a==0 && b!=0){
            System.out.printf("phuong trinh vo nghiem");
            System.exit(0);
        }
        if(a!=0){
            double x=(-b)/a;
            System.out.printf("nghiem cua phuong trinh la %f",x);
            System.exit(0);
        }
    }
}
