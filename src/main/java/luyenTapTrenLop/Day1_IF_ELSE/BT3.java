package luyenTapTrenLop.Day1_IF_ELSE;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Bước 1: Nhập năm
        //nam nhuận là năm chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int x= in.nextInt();
        in.close();
        // Bước 2: Kiểm tra
        if(x < 1582){
            System.out.println("Không xác định!");
            System.exit(0);
        }
        if(x % 400 == 0 || (x % 4 == 0 && x % 100 != 0)){
            System.out.println("Là năm nhuận!");
            System.exit(0);
        }
        System.out.println("Không nhuận");
    }
}
