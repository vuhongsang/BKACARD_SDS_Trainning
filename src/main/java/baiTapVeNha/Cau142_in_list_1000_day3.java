package baiTapVeNha;

import java.util.Scanner;

public class Cau142_in_list_1000_day3 {
    public static void main(String[] args) {
        //142.Tìm “giá trị nhỏ nhất” trong mảng một chiều số thực (nhonhat).
        //input: nhập mảng 1 chiều n số thực

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
        //----------search min value in array-------------
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.printf("\nGiá trị min = %d",min);
    }
}
