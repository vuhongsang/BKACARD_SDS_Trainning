package luyenTapTrenLop.Day2_BREAK_CONTINUE;

import java.rmi.MarshalException;
import java.util.Scanner;

public class Cau33_in_list_1000 {
    public static void main(String[] args) {
        // cau 33 tinh sn can2, co n dau can
        // input: nhap so can n
        // output : S(n)= ??
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập vào số căn n= ");
        int n=in.nextInt();
        in.close();

        if (n<1){
            System.out.printf("nhap lai");
            System.exit(0);
        }
        //Bước 3
        double t = 0;
        for (int i=1;i<=n;i++){
            t = Math.sqrt(t+2);
        }
        System.out.printf("S(n)"+t);

    }
}
