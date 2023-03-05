package baiTapVeNha;

import java.util.Scanner;

public class Cau145_in_list_1000_day3 {
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
        //mảng 1 chiều các số nguyên
        //output: số hoàn thiện đầu tiên || -1
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
        //---------------------------
        int value_SHT=-1;
        boolean flag_SHT=false;
        for (int i = 0; i < arr.length; i++) {
            if (SHT(arr[i]) == true) {
                value_SHT = arr[i];
                flag_SHT=true;
                break;
            }
        }
        if (flag_SHT == true) {
            System.out.printf("\nSố hoàn thiện đầu tiên của mảng trên là : %d", value_SHT);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại số hoàn thiện trong mảng : %d", value_SHT);
            System.exit(0);
        }
    }
}
