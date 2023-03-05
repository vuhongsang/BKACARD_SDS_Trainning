package baiTapVeNha;

import java.util.Scanner;

public class Cau150_in_list_1000_day3 {
    public static void main(String[] args) {
        //trả về giá trị âm lớn nhất
        // không tồn tại return 0;
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
        //-------------giá trị âm lớn nhất trong mảng || return 0
        int value_neg=0;
        boolean flag_neg=false;
        for (int value : arr) {
            if (value < 0) {
                value_neg=value;
                flag_neg=true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (value_neg < arr[i]) {
                if (arr[i] >= 0) {
                    continue;
                }
                value_neg = arr[i];
                flag_neg=true;
            }
        }
        if (flag_neg == true) {
            System.out.printf("\nGía trị âm lớn nhất là %d", value_neg);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại giá trị âm !! %d",value_neg);
            System.exit(0);
        }
    }
}
