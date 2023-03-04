package luyenTapTrenLop.Day2_ARRAY;

import java.util.Scanner;

public class PrimeNumber {
    //tìm số có phải số nguyên tố hay không
    // tìm giá trị từ 2 đến căn bậc 2 của n --> vì căn bậc 2 của n là số chia hết ngoài n ra
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.printf("Nhập số cần kiểm tra nguyên tố hay không = ");
        int snt=in.nextInt();
        in.close();

        if (snt<=1){
            System.out.printf("không là số nguyên tố");
            System.exit(0);
        }
        if (snt<0){
            System.out.printf("không hợp lệ");
            System.exit(0);
        }

        boolean flag_snt=true;
        for (int i=2;i<=Math.sqrt(snt);i++){
            if (snt%i==0){
                flag_snt=false;// nếu chia hết thì không là số nguyên tố
                break;
            }
        }
        if (flag_snt==true){
            System.out.printf("số vừa nhập là số nguyên tố");
            System.exit(0);
        }
        else{
            System.out.printf("không là số nguyên tố");
            System.exit(0);
        }

    }
}
