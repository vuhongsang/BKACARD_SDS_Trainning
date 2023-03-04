package baiTapVeNha;

import java.util.Scanner;

public class Cau134_in_list_1000_day2 {
    public static void main(String[] args) {
        //134.Viết hàm tìm “giá trị lớn nhất” trong mảng một chiều số thực (lonnhat).
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước của array : ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.printf("Nhập lại kích thước của array");
        }
        int[] arr = new int[n];

        //------nhập phần tử con-----------
        System.out.printf("Nhập giá trị các phần tử con của mảng: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ",i);
            arr[i]=in.nextInt();
        }
        in.close();
        //-------in mảng vừa tạo----------------
        System.out.printf("Mảng vừa tạo là : ");
        for (int value : arr) {
            System.out.printf(value+"\t");
        }
        //---------tìm giá trị lớn nhất trong mảng--------------
        int value_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (value_max < arr[i]) {
                value_max = arr[i];
            }
        }
        System.out.printf("Giá trị max= %d",value_max);

    }
}
