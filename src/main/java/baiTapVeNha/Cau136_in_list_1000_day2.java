package baiTapVeNha;

import java.util.Scanner;

public class Cau136_in_list_1000_day2 {
    public static void main(String[] args) {
        //136.Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên(chancuoi).
        // Nếu mảng không có giá trị chẵn thì trả về giá trị -1.
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
            System.out.printf("arr[%d]= ",i);
            arr[i]=in.nextInt();
        }
        in.close();
        //-------in mảng vừa tạo----------------
        System.out.printf("Mảng vừa tạo là : ");
        for (int value : arr) {
            System.out.printf(value+"\t");
        }
        // tìm số chẵn cuối cùng. nếu mảng không có giá trị chẵn trả về -1
        int output_resul=-1;
        boolean flag = true;//not exists number %2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                output_resul = arr[i];
                flag = false;
            }
        }
        if (flag) {
            System.out.printf("\nkhông có giá trị chẵn: %d", output_resul);
            } else {
            System.out.printf("\nGía trị chẵn cuối cùng là : %d",output_resul);
        }
    }
}
