package baiTapVeNha;

import java.util.Scanner;

public class Cau144_in_list_1000_day3 {
    public static boolean SNT(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if (x <= 1) {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Tìm số nguyên tố đầu tiên trong mảng arr
        //output: snt || -1
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước mảng n= ");
        int n=in.nextInt();
        if (n < 1) {
            System.out.printf("\nNhập sai, nhập lại kích thước mảng");
            System.exit(0);
        }
        //-----------input array--------------------
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ",i);
            arr[i]=in.nextInt();
        }
        in.close();
        //-----------display array-------------------
        System.out.printf("\nMảng vừa tạo là = ");
        for (int value : arr) {
            System.out.printf("%d\t",value);
        }
        //-------Tìm số nguyên tố đầu tiên trong mảng
        boolean flag_snt=false;
        int value_snt=-1;
        for (int i = 0; i < arr.length; i++) {
            if (SNT(arr[i])) {
                if (arr[i] <=1) {
                    continue;
                }
                flag_snt=true;
                value_snt=arr[i];
                break;
            }
        }
        if (flag_snt) {
            System.out.printf("\nMảng trên có số nguyên tố đầu tiên là %d", value_snt);
            System.exit(0);
        } else {
            System.out.printf("\nMảng trên không có số nguyên tố !! %d",value_snt);
            System.exit(0);
        }

    }
}
