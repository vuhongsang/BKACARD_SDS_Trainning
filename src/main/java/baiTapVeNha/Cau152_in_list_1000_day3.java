package baiTapVeNha;

import java.util.Scanner;

public class Cau152_in_list_1000_day3 {
    public static boolean SHT(double x) {
        int sum=0;
        if (x <= 1) {
            return false;
        }
        for (int i = 0; i <= (x / 2); i++) {
            if (x % i == 0) {
                sum=sum+i;
            }
        }
        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }
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
        //-----------------------
        int value_ht=0;
        boolean flag_ht=false;
        for (int j : arr) {
            if (SHT(j)) {
                value_ht=j;
                flag_ht=true;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (value_ht < arr[i]) {
                if (!SHT(arr[i])) continue;
                value_ht = arr[i];
                flag_ht=true;
            }
        }
        if (flag_ht) {
            System.out.printf("\nĐây là số hoàn thiện : %d", value_ht);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại : %d", value_ht);
            System.exit(0);
        }
    }
}
