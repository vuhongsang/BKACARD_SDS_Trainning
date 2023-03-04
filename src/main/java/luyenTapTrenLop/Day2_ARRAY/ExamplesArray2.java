package luyenTapTrenLop.Day2_ARRAY;

import java.util.Random;
import java.util.Scanner;

public class ExamplesArray2 {
    //tạo 1 bảng n phần tử và nhập giá trị cho mảng và in ra
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.printf("Nhập kích thước mảng: ");
        int n=in.nextInt();
        in.close();
        if (n<1){
            System.out.printf("Kích thước mảng không hợp lệ");
            System.exit(0);
        }
        Random random=new Random();
        //tạo mảng randum
        int[] arr=new int[n];

        //lặp lại n lần, mỗi lần lặp gán 1 giá trị ngẫu nhiên
        for (int i=0; i<n;i++){
            arr[i]=random.nextInt(1000);
        }

        //in ra mảng vừa tạo
        for (int i=0;i<n;i++){
            System.out.printf("\n arr[%d] = %d",i,arr[i]);
        }
    }
}
