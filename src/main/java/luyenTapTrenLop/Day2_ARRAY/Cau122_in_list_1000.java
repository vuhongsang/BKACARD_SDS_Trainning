package luyenTapTrenLop.Day2_ARRAY;

import java.util.Random;
import java.util.Scanner;

public class Cau122_in_list_1000 {
    //Tìm giá trị lớn nhất trong mảng 1 chiều các số thực
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
        // tìm giá trị lớn nhất trong mảng 1 chiều
        //max
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.printf("Max= %d ",max);

    }
}
