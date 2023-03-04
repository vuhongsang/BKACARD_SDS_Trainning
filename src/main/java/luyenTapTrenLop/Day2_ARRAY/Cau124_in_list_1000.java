package luyenTapTrenLop.Day2_ARRAY;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Cau124_in_list_1000 {
    ///hàm kiểm tra trong mảng các số nguyên có tồn tại số lẻ và giá trị <2004 không?
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
        // tìm số chẵn có giá trị nhỏ hơn 2004
        // chỉ cần tìm giá trị đầu tiên thỏa mãn
        int flag_Min=0;// Tồn tại hay không 1: tồn tại 0: không
        long min=arr[0]; // gia tri defaul
        for (int i =0;i<arr.length;i++){
            if (arr[i]%2==0 && arr[i]<2004){
                flag_Min=1;
                min =arr[i];
                break;
            }
        }
        if (flag_Min==1){
            System.out.printf("Tồn tại giá trị min = %d  nhỏ hơn 2004 trong mảng",min);
        }
        if (flag_Min==0){
            System.out.printf("Không tồn tại giá trị chẵn và nhỏ hơn 2004 trong mảng trên");
        }
    }
}
