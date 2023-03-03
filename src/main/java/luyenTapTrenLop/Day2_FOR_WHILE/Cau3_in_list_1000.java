package luyenTapTrenLop.Day2_FOR_WHILE;

import java.util.Scanner;

public class Cau3_in_list_1000 {
    public static void main(String[] args) {
        //Tính S(n) = 1/2 + 1/2 + 1/3 + … + 1/n.
        //input nhap n
        //output tong sn

        Scanner in = new Scanner(System.in);
        System.out.printf("nhap so thu n = ");
        double n = in.nextLong();
        in.close();

        if(n==0||n<=1){
            System.out.printf("\n vui long nhap lai n!=0 ");
        }
        /////////------------
        double sum=0;
        for (double i=1;i<=n;i++){
            sum=sum+(1/i);
        }
        System.out.printf("tong Sn= %f",sum);
        System.exit(0);
    }
}
