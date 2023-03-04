package baiTapVeNha;

import java.util.Scanner;

public class Cau135_in_list_1000_day2 {
    public static void main(String[] args) {
        //Tìm “giá trị dương đầu tiên” trong mảng một chiều các số thực (duongdau).
        // Nếu mảng không có giá trị dương thì trả về giá trị -1

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
        // giá trị dương đầu tiên or output -1
        int max=-1;
        boolean flag_negative=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                flag_negative=false;
                max =  arr[i];
                break;
            }
        }
        if (flag_negative==true) {
            System.out.printf("\nMảng không có giá trị dương : %d", max);
        } else {
            System.out.printf("\nGía trị dương đầu tiên là %d",max);
        }
    }
}
