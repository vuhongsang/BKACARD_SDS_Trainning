package luyenTapTrenLop.Day2_ARRAY;

import java.util.Random;
import java.util.Scanner;
public class Cau125_in_list_1000 {
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Viết hàm đếm số lượng số nguyên tố nhỏ hơn 100 trong mảng.
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
        // tìm tổng số nguyên tố nhỏ hơn 100 trong mảng
        int nt_count=0; // count số nguyên tố
        for (int i =0;i<arr.length;i++){
            if(isPrimeNumber(arr[i])==true){//nếu nguyên tố thì count +1
                nt_count++;
            }
        }
        if (nt_count != 0) {
            System.out.printf("tổng số nguyên tố của mảng trên là : %d ", nt_count);
            System.exit(0);
        } else {
            System.out.printf("mảng trên không tồn tại số nguyên tố");
            System.exit(0);
        }
    }
}
