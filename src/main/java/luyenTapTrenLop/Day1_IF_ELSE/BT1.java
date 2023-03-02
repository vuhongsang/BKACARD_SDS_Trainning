package luyenTapTrenLop.Day1_IF_ELSE;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        //nhập số nguyên từ bàn phím, cho biết âm hay dương?
        //xác định biểu thức logic
        // x > 0 dương
        //x == 0 không dương không âm
        //x <0 âm
        //----------------------------
        //bước 1: khai báo và nhập x
        Scanner in = new Scanner(System.in);
        System.out.printf("nhap x= ");
        int x = in.nextInt();
        in.close();
        if (x>0){
            System.out.printf("so duong");
        }
        if (x<0){
            System.out.printf("so am");
        }
        if (x==0){
            System.out.printf("khong am khong duong");
        }
    }
}
