package baiTapVeNha;

import java.util.Scanner;

public class Cau148_in_list_1000_day3 {
    public static boolean SNT(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= (x / 2); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //tìm số nguyên tố cuối cùng trong mảng
        //không tồn tại return -1
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước mảng n= ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.printf("\nNhập sai, nhập lại kích thước mảng");
            System.exit(0);
        }
        //-----------input array--------------------
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ", i);
            arr[i] = in.nextInt();
        }
        in.close();
        //-----------display array-------------------
        System.out.printf("\nMảng vừa tạo là = ");
        for (int value : arr) {
            System.out.printf("%d\t", value);
        }
        //------------tìm số nguyên tố || return -1------
        int value_snt=-1;
        boolean flag_snt=false;
        for (int i = 0; i < arr.length; i++) {
            if (SNT(arr[i]) == true) {
                value_snt = arr[i];
                flag_snt=true;
            }
        }
        if (flag_snt == true) {
            System.out.printf("\nSố nguyên tố cuối cùng là %d", value_snt);
            System.exit(0);
        } else {
            System.out.printf("\nMảng không có số nguyên tố : %d", value_snt);
            System.exit(0);
        }
    }
}
