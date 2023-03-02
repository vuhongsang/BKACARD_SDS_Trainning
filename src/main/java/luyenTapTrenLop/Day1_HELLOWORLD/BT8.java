package luyenTapTrenLop.Day1_HELLOWORLD;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        int x,y,z,t;
        Scanner in = new Scanner(System.in);
        System.out.printf("nhap so x= ");
        x= in.nextInt();
        System.out.printf("nhap so y= ");
        y= in.nextInt();
        System.out.printf("nhap so z= ");
        z= in.nextInt();
        System.out.printf("nhap so t= ");
        t= in.nextInt();
        //---------------------
        Boolean A= (2*x>5) && (3*y <10) || (5*z+6>t);
        System.out.printf("A= %s",A);
        in.close();
    }
}
