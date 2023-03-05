package baiTapVeNha;

import java.util.Scanner;

public class Cau153_in_list_1000_day3 {
    public static void main(String[] args) {
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
        //-------tìm 1 gias trị chẵn tồn tại
        int value_div2=-1;
        boolean flag_div2=false;
        for (int j : arr) {
            if (j % 2 == 0) {
                value_div2=j;
                flag_div2 = true;
            }
        }
        //--------------------
        for (int i = 0; i < arr.length; i++) {
            if (value_div2 > arr[i]) {
                if (arr[i] % 2 != 0 || arr[i] < 0) {
                    continue;
                }
                value_div2 = arr[i];
                flag_div2=true;
            }
        }
        if (flag_div2) {
            System.out.printf("\nGía trị min chẵn là : %d", value_div2);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại giá trị chẵn!! : %d", value_div2);
            System.exit(0);
        }
    }
}
