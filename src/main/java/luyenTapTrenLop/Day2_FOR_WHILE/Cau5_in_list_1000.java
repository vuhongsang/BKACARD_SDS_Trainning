package luyenTapTrenLop.Day2_FOR_WHILE;

import java.util.Scanner;

public class Cau5_in_list_1000 {
    public static void main(String[] args) {
        // 5. sn=1+ 1/3 + 1/5 + 1 /7 +...1/2n+1
        // output sn
        // input n
        Scanner in = new Scanner(System.in);
        System.out.printf("nhap so thu n = ");
        double n = in.nextLong();
        in.close();

        if(n==0||n<=1){
            System.out.printf("\n vui long nhap lai n!=0 ");
        }

        double sum=0;
        for (int i=0;i<=n;i++){
            sum=sum+1.0/(2*i+1);
        }
        System.out.printf("tong Sn= %f",sum);
        System.exit(0);
    }
}
