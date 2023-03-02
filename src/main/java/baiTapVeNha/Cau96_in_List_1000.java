package baiTapVeNha;

import java.util.Scanner;

public class Cau96_in_List_1000 {
    public static void main(String[] args) {
        //96. Viết chương trình nhập giá trị x sau khi tính giá trị của hàm số:
        //fx=2*x*x + 5*x +9 khi x>=5
        //fx= -2*x*x + 4*x - 9 khi x<5
        Scanner in = new Scanner(System.in);
        System.out.printf("nhập giá trị x= ");
        double x = in.nextDouble();
        in.close();

       if(x>=5){
           double fx = 2*x*x + 5*x +9;
           System.out.printf("gia tri fx= %.2f",fx);
       }
        if(x<5){
            double fx = -2*x*x + 4*x - 9;
            System.out.printf("gia tri fx= %.2f",fx);
        }
    }
}
