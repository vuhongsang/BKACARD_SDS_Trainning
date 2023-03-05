package baiTapVeNha;

import java.util.Scanner;

public class Cau143_in_list_1000_day3 {
    public static void main(String[] args) {
        //Viết hàm tìm “số chẵn đầu tiên” trong mảng các số nguyên (chandau).
        //Nếu mảng không có giá trị chẵn thì hàm sẽ trả về giá trị không chẵn là -1
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước mảng n= ");
        int n=in.nextInt();
        if (n < 1) {
            System.out.printf("\nNhập sai, nhập lại kích thước mảng");
            System.exit(0);
        }
        //-----------input array--------------------
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ",i);
            arr[i]=in.nextInt();
        }
        in.close();
        //-----------display array-------------------
        System.out.printf("\nMảng vừa tạo là = ");
        for (int value : arr) {
            System.out.printf("%d\t",value);
        }
        //---------export first /2=0 in array
        // if not exists --> -1
        boolean flag=false;
        int div2=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                flag=true;
                div2 = arr[i];
                break;
            }
        }
        if (flag) {
            System.out.printf("\nMảng tồn tại số chẵn là %d", div2);
            System.exit(0);
        } else {
            System.out.printf("\nMảng không tồn tại số chẵn !! %d",div2);
            System.exit(0);
        }
    }
}
