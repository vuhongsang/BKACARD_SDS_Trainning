package luyenTapTrenLop.Day2_BREAK_CONTINUE;

import java.util.Scanner;

public class Cau34_in_list_1000 {
    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập vào số căn n= ");
        int n=in.nextInt();
        in.close();
        if (n<1){
            System.out.printf("nhap lai");
            System.exit(0);
        }
        double t=0;
        for (int i=0;i<=n;i++){
            t=Math.sqrt(i+t);
        }
        System.out.printf("S(n)="+t);

    }
}
