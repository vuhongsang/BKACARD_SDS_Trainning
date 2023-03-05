package baiTapVeNha;

import java.util.Scanner;

public class Cau147_in_list_1000_day3 {
    public static void main(String[] args) {
        //mảng số thực n
        //output : số dương cuối cùng || return -1
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
        //-----------------------------
        int value_pos=-1;
        boolean flag_pos=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                value_pos = arr[i];
                flag_pos=true;
            }
        }
        if (flag_pos == true) {
            System.out.printf("\nGiá trị dương cuối cùng trong mảng là %d", value_pos);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại giá trị dương %d", value_pos);
            System.exit(0);
        }
    }
}
