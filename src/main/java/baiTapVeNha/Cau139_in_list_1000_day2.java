package baiTapVeNha;

import java.util.Scanner;

public class Cau139_in_list_1000_day2 {
    public static boolean sohoanthien(double x) {
        int sum=0;
        for (int i = 0; i <= (x / 2); i++) {
            if (x % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == x) {
            return true;// hoàn thiện
        }
        return false;//không hoàn thiện
    }

    public static void main(String[] args) {
        //139.Tìm “vị trí số hoàn thiện cuối cùng” trong mảng một chiều các số nguyên (vitrihoanthiencuoi).
        // Nếu mảng không có số hoàn thiện thì trả về giá trị - 1.
        // số hoàn thiện là số dạng như sau
        // 6 = 1+2+3 và 6/2 6/3 6/1 đều dư 0

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
        //--test---------------------------------
        //if (sohoanthien(6)==true) {
        //    System.out.printf("So hoan thien");
        //} else {
        //    System.out.printf("Khong hoan thien");
        //}
        //---test-----------------------------------
        // lọc ra số hoàn thiện trong bảng
        // etc : 6 28 496 8128
        boolean flag=false;
        int location=-1;
        for (int i = 0; i < arr.length; i++) {
            if (sohoanthien(arr[i]) == true) {
                location = i;
                flag = true;
            }
        }
        if (flag==false) {
            System.out.printf("\nKhông tồn tại số hoàn thiện trong bảng: %d", location);
            System.exit(0);
        } else {
            System.out.printf("\nTồn tại số hoàn thiện, tại vị trí arr= %d ",location);
            System.exit(0);
        }

    }
}
