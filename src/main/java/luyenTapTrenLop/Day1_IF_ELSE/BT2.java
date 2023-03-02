package luyenTapTrenLop.Day1_IF_ELSE;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        //kiểm tra chẵn hay là số lẻ
        //nhap so x
        Scanner in = new Scanner(System.in);
        System.out.printf("nhap so x can xac dinh= ");
        int x = in.nextInt();
        in.close(); // dong cua so nhap

        if (x%2==0){
            System.out.printf("x la so chan");
        }
        if (x%2!=0){
            System.out.printf("x la so le");
        }
    }
}
