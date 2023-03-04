package baiTapVeNha;

import java.util.Scanner;

public class Cau140_in_list_1000_day2 {
    public static void main(String[] args) {
        //Hãy tìm “giá trị dương nhỏ nhất” trong mảng các số thực (duongnhonhat)
        //Nếu mảng không có giá trị dương thì trả về giá trị không dương là – 1
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước của array : ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.printf("Nhập lại kích thước của array");
            System.exit(0);
        }
        int[] arr = new int[n];

        //------nhập phần tử con-----------
        System.out.printf("Nhập giá trị các phần tử con của mảng: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ", i);
            arr[i] = in.nextInt();
        }
        in.close();
        //-------in mảng vừa tạo----------------
        System.out.printf("Mảng vừa tạo là : ");
        for (int value : arr) {
            System.out.printf(value + "\t");
        }
        //--check bảng xem có giá trị dương ko---------------------------------------
        boolean flag_positive=false;
        int min=arr[0];
        for (int value : arr) {
            if (value > 0) {
                flag_positive=true;
                min=value;
            }
        }
        if (flag_positive != true) {
            System.out.printf("\nMảng không tồn tại giá trị dương, nhập lại : %d",-1);
            System.exit(0);
        }
        if (flag_positive == true) {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    if (arr[i] < 0) {
                        continue;
                    }
                min=arr[i];
                }
            }
        }
        System.out.printf("\nGiá trị min dương của mảng là %d",min);

    }
}
