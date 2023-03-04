package baiTapVeNha;

import java.util.Scanner;

public class soHoanThien {
    public static void main(String[] args) {
        // số hoàn thiện là số có dạng
        // ví dụ 6=3+2+1 và 6 đều chia hết 3,2,1
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập số x = ");
        int x = in.nextInt();
        int sum=0;
        boolean flag=false;
        for (int i = 1; i <= (x / 2); i++) {
            if (x % i == 0) {
                sum=sum+i;
            }
        }
        if (sum == x) {
            flag = true;
            System.out.printf("\nLà số hoàn thiện");
        } else {
            flag=false;
            System.out.printf("\nKhông là số hoàn thiện");
        }
    }
}
