package baiTapVeNha;

import java.util.Scanner;

public class Cau149_in_list_1000_day3 {
    public static boolean SHT(double x) {
        int sum=0;
        if (x <= 1) {
            return false;
        }
        for (int i = 0; i <= (x / 2); i++) {
            if (x%i==0) {
                sum=sum+i;
            }
        }
        if (x == sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        //Tìm số hoàn thiện cuối cùng
        //không tồn tại --> -1
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
        //-------------Số hoàn thiện cuối cùng-----------------
        int value_sht=-1;
        boolean flag_sht=false;
        for (int i = 0; i < arr.length; i++) {
            if (SHT(arr[i]) == true) {
                value_sht = arr[i];
                flag_sht=true;
            }
        }
        if (flag_sht == true) {
            System.out.printf("\nSố hoàn thiện cuối cùng là %d", value_sht);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại !! %d", value_sht);
            System.exit(0);
        }
    }
}
