package luyenTapTrenLop.Day1_SWITCH_CASE;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        //nhap vao thang va nam va in ra ngay trong thang
        //input thang va nam
        //output: số ngày trong tháng
        //30 ngày 4 6 9 11
        //31 ngày 1 3 5 7 8 10 12
        //Tháng 2 có 28 hoặc 29 ngày ( tùy năm nhuận hay không )
        //---------------------------------

        Scanner in = new Scanner(System.in);
        System.out.printf("nhap vao thang va nam = ");
        int thang= in.nextInt();
        int nam= in.nextInt();
        in.close();
        //-------------------------------------
        if(thang<1||thang>12){
            System.out.printf("thang nhap khong hop le");
            System.exit(0);
        }
        if(nam<1582){
            System.out.println(nam+" nam nay khong hop le");
            System.exit(0);
        }
        switch (thang) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("thang %d nam %d co 30 ngay", thang, nam);
                break;
            case 2: {
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                    System.out.printf("nam nay co 29 ngay");
                    break;
                    } else {
                    System.out.printf("nam nay co 28 ngay");
                    break;
                    }
                }
                default:
                    System.out.printf("nam nay co 31 ngay");
                    break;


        }
    }
}
