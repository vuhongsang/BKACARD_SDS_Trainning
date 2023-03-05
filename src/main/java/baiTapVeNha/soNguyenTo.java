package baiTapVeNha;

import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        //số nguyên tố là số chia hết cho1 và chính nó
        //--> nếu tồn tại 1 số trong khoảng từ >1 đến<= sqrt
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập số nguyên tố n = ");
        int n = in.nextInt();
        in.close();
        //check from 1--sqrt(n)
        if (n <= 1) {
            System.out.printf("Đây không phải số nguyên tố !!");
            System.exit(0);
        }
        boolean flag_nt=true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag_nt = false;
                break;
            }
        }
        if (flag_nt == true) {
            System.out.printf("\nĐây là số nguyên tố");
            System.exit(0);
        } else {
            System.out.printf("\nĐây không phải số nguyên tố");
            System.exit(0);
        }
    }
}
