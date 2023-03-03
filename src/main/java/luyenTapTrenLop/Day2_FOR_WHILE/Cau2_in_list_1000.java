package luyenTapTrenLop.Day2_FOR_WHILE;

import java.util.Scanner;

public class Cau2_in_list_1000 {
    public static void main(String[] args) {
        //sn= 1 + 2^2 + 3^2 +n ^2
        //sum sn= ?

        Scanner in = new Scanner(System.in);
        System.out.printf("nhap so thu n = ");
        double n = in.nextLong();
        in.close();

        if(n<=1){
            System.out.printf("\n vui long nhap lai n>1 ");
            System.exit(0);
        }
        long sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i*i;
        }
        System.out.printf("tong sn = %d",sum);
        sum=0;
        System.exit(0);
    }
}
