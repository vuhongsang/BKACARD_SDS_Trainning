package luyenTapTrenLop.Day2_ARRAY;

import java.util.Random;
import java.util.Scanner;

public class Cau123_in_list_1000 {
    //Viết hàm tìm một vị trí mà giá trị tại vị trí đó là một giá trị nhỏ nhất trong mảng một chiều các số nguyên
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int n = in.nextInt();
        in.close();
        if (n < 1) {
            System.out.println("Kích thước mảng không hợp lệ!");
            System.exit(0);
        }
        Random random = new Random();
        // Tao mang
        int[] arr = new int[n];

        // Lặp n lần
        // Mỗi lần lặp -> gán giá trị ngẫu nhiên cho mảng vừa nhập
        for (int i = 0; i < n; i++) {
            // 0 -> 9999
            arr[i] = random.nextInt(10000);
        }

        System.out.println("a. In ra mảng vừa tạo");
        // Foreach
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();
        // tìm giá trị nhỏ nhất trong mảng 1 chiều
        //max
        int min=arr[0];
        int index_min=0;
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
                index_min=i;
            }
        }
        System.out.printf("giá trị min đầu tiên là %d tại vị trí %d",min,index_min);


    }
}
