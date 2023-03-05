package baiTapVeNha;

import java.util.Scanner;

public class Cau146_in_list_1000_day3 {
    public static void main(String[] args) {
        //tìm giá trị âm đầu tiên trong mảng 1 chiều số thực
        //output giá trị âm hoặc nếu không tồn tại trả về =1
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
        //--------------tìm giá trị âm đầu tiên
        int value_neg=1;
        boolean flag_neg=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                value_neg = arr[i];
                flag_neg=true;
                break;
            }
        }
        if (flag_neg == true) {
            System.out.printf("\nGiá trị âm = %d", value_neg);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại giá trị âm !! %d",value_neg);
            System.exit(0);
        }

    }
}
