package luyenTapTrenLop.Day2_FOR_WHILE;

import java.util.Scanner;

public class Cau1_in_list_1000 {
    public static void main(String[] args) {
        //Tính S(n) = 1 + 2 + 3 + … + n
        //input : nhap n
        //output : sum

        Scanner in = new Scanner(System.in);
        System.out.printf("nhap so thu n = ");
        long n = in.nextLong();
        in.close();
        if(n<=1){
            System.out.printf("\n vui long nhap lai n>1 ");
        }
        long sum=0;
        for(long i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.printf("tong S(n) la : %d",sum);
        System.exit(0);

    }
}
