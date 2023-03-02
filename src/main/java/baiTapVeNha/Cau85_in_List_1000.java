package baiTapVeNha;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Cau85_in_List_1000 {
    public static void main(String[] args) {
        //nhập vào 1 tháng cùa năm cho biết tháng thuộc quý mấy của năm
        //input tháng trong năm
        //output tháng thuộc quý mấy
        Scanner in = new Scanner(System.in);
        System.out.printf("nhập vào 1 tháng cùa năm= ");
        int thang=in.nextInt();
        in.close();

        if(thang<1 || thang >12){
            System.out.printf("Nhập đúng giá trị tháng 1-->12 ");
            System.exit(0);
        }
        switch (thang){
            case 1:
            case 2:
            case 3:
                System.out.printf("thang %d thuộc quý 1",thang);
                break;
            case 4:
            case 5:
            case 6:
                System.out.printf("tháng %d thuộc quý 2",thang);
                break;
            case 7:
            case 8:
            case 9:
                System.out.printf("tháng %d thuộc quý 3",thang);
                break;
            default:
                System.out.printf("tháng %d thuộc quý 4",thang);
                break;
        }
    }
}
