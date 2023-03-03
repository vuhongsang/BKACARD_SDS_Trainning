package luyenTapTrenLop.Day2_FOR_WHILE;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        for (int i = 1; i<=10;i++){
            System.out.printf(i+"\t");
        }
        System.out.printf("\n");
        //in ra cac so 1, 3, 5, 7, 9
        for (int i=1;i<99;i=i+2){
            System.out.printf(i + "\t");
        }
        //in ra các số chẵn trong đoạn a b
        //input a,b long && b>a
        //output : in ra các số chẵn
        //output2: in ra có bao nhiêu số lẻ trong khoảng (a,b)
        System.out.printf("\n");

        Scanner in = new Scanner(System.in);
        System.out.printf("nhập vào giá bị đầu và cuối của mảng (a,b)= ");
        long a=in.nextLong();
        long b=in.nextLong();
        in.close();
        System.out.printf("gia tri le trong (a,b)= ");
        if (b<a){
            System.out.printf("nhap lai gia tri thoa man dk a<b");
            System.exit(0);
        }
        for (long i =a; i<=b;i++){
            if (i%2!=0){
                System.out.printf(i+"\t");
            }
        }


    }
}
