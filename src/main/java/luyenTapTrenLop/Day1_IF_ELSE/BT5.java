package luyenTapTrenLop.Day1_IF_ELSE;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        //nhap vao so nguyen x ho x co phai so chinh phuong hay khong
        //input x
        //output x
        Scanner in = new Scanner(System.in);
        System.out.printf("x= ");
        int x =in.nextInt();
        in.close();

        double tmp = Math.sqrt(x);//3.8
        int tmp1=(int) tmp; //3
        if(tmp==tmp1){
            System.out.printf("so chinh phuong");
        }
        else {
            System.out.printf("khong la so chinh phuong");
        }
    }
}
