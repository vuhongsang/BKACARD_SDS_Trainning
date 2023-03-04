package baiTapVeNha;

import java.util.Scanner;

public class Cau141_in_list_1000_day2 {
    public static void main(String[] args) {
        //nhập bảng arr có n phần tử
        //ouput: min dương nhỏ nhất
        //output: nếu không tồn tại trả về vị trí -1
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
        //--------------------check có giá trị dương hay không
        boolean flag_positive=false;
        int min=-1;
        int location=-1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > 0) {
                flag_positive=true;
                min=arr[i];
                location=i;
            }
        }
        if (flag_positive != true) {
            System.out.printf("\nKhông tồn tại giá trị dương trong bảng (%d) tại vị trí %D",min,location);
        }
        if (flag_positive == true) {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    if (arr[i]<=0) {
                        continue;
                    }
                    min = arr[i];
                    location=i;
                }
            }
            System.out.printf("\nGía trị min dương trong bảng là: %d tại vị trí %d",min,location);
        }
    }
}
