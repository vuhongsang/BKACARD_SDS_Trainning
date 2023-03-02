package baiTapVeNha;

import java.util.Scanner;

public class Cau83_in_List_1000 {
    public static void main(String[] args) {
        //viết chương trình nhập vào 2 số thực xem chúng có dấu hay không
        //input a,b
        //output kiểm tra 2 số có dấu hay không

        Scanner in = new Scanner(System.in);
        System.out.printf("nhap 2 so thuc a,b = ");
        double a=in.nextDouble();
        double b=in.nextDouble();
        in.close();

        if((Math.abs(a)==a && Math.abs(b)==b) || (Math.abs(a)!=a && Math.abs(b)!=b))
        {
            System.out.printf("2 so thuc cung dau");
            System.exit(0);
        }
        else {
            System.out.printf("2 so thuc khac dau");
            System.exit(0);
        }

    }
}
