package luyenTapTrenLop.Day2_FOR_WHILE;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //có bao nhiêu số lẻ trong khoảng (a,b)
        //input a,b --> long (a<b)
        //output tổng lẻ
        // vd (1,9) --> 3,,5,7 không tính 2 cận 1,9
        Scanner in = new Scanner(System.in);
        System.out.printf("nhập vào giá bị đầu và cuối của mảng (a,b)= ");
        long a=in.nextLong();
        long b=in.nextLong();
        in.close();
        long count=0;
        for (long i = a+1;i<b-1;i++){
            if (i%2!=0){
                count=count+1;
            }
        }
        System.out.printf("tong gia tri le la %d",count);
        count=0;
        System.exit(0);
    }
}
