package luyenTapTrenLop.Day1_HELLOWORLD;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        //nhap vao so nguyen a va b tu ban phim
        //in ra thuong va so du cua a va b
        //vd 5/2 du 1    -5/2 dư ??1
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.printf("nhap so a= ");
        a = in.nextInt();
        System.out.printf("nhap so b= ");
        b = in.nextInt();
        //---------phan thuong
        int thuong = (a-b);
        int phandu =a%b;
        System.out.printf("thuong a va b= %d",thuong);
        System.out.printf("\n phan du a va b= %d",phandu);
        in.close();
    }
}
