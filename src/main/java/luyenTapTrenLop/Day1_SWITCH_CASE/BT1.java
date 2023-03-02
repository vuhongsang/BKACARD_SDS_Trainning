package luyenTapTrenLop.Day1_SWITCH_CASE;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        //switch-case : làm việc với các giá trị cụ thể
        //nhập vào tháng, hiển thị ra số ngày trong tháng
        // input: tháng (số nguyên)
        //output: số ngày trong tháng
        //30 ngày 2 4 6 9 11
        //31 ngày 1 3 5 7 8 10 12
        //Tháng 2 có 28 hoặc 29 ngày ( tùy năm nhuận hay không )

        Scanner in = new Scanner(System.in);
        System.out.printf("nhap thang: ");
        int x = in.nextInt();
        in.close();
        if (x<1||x>12){
            System.out.printf("thang khong hop le");
            System.exit(0);
        }
        switch (x){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("have 30 days");
                break;
            case 2:
                System.out.printf("have 29 or 28 days");
                break;
            default:
                System.out.printf("have 31 day");
                break;

        }

    }
}
