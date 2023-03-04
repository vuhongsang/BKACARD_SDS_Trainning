package luyenTapTrenLop.Day2_ARRAY;

import java.util.Random;
import java.util.Scanner;

public class ExampleArray3 {
    // tạo 1 mảng ngẫu nhiên gồm n số thực
    // in ra mảng vừa tạo
    // in ra max, min
    // tính trung bình cộng
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

        System.out.println("b. In ra số bé nhất và lớn nhất");
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("Min = %d, max = %d \n", min, max);

        // Tinh trung binh cong
        double t = 0;
        for (int i : arr) {
            t = t + i;
        }
        System.out.println("Trung bình cộng: " + (t / n));
    }
}
