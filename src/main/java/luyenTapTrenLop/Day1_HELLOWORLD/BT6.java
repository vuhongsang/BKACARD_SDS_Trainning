package luyenTapTrenLop.Day1_HELLOWORLD;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        //nhap 2 so nguyen (long) x va y in ra trung binh cong cua 2 so do goi y nextlong()
        long x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        x = in.nextLong();
        System.out.print("y = ");
        y = in.nextLong();
        in.close();
        double tbc = (x+y)/2.0;
        System.out.printf("trung binh cong la==== %.2f", tbc);
    }

}
