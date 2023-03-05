package baiTapVeNha;

import java.util.Scanner;

public class Cau151_in_list_1000_day3 {
    public static boolean SNT(double x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Tìm số nguyên tố lớn nhất. nếu mảng không có số nguyên tố thì trả giá trị 0
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
        // SỐ NGUYÊN TỐ LỚN NHẤT, NẾU ! THÌ RETURN 0
        int value_snt=0;
        boolean flag_snt=false;
        //-tìm 1 số nguyên tố tồn tại --> số max mặc định
        for (int j : arr) {
            if (SNT(j) == true) {
                value_snt=j;
                flag_snt=true;
                break;
            }
        }
        //-------so sánh + xác định là số nt ko
        for (int i = 0; i < arr.length; i++) {
            if (value_snt < arr[i]) {
                if (SNT(arr[i]) == false) continue;
                value_snt = arr[i];
                flag_snt=true;
            }
        }
        if (flag_snt == true) {
            System.out.printf("\nSố nguyên tố max= %d", value_snt);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại số nguyên tố trong bảng !! %d",value_snt);
            System.exit(0);
        }
    }
}
