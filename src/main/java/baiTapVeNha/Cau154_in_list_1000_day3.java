package baiTapVeNha;

import java.util.Scanner;

public class Cau154_in_list_1000_day3 {
    public static void main(String[] args) {
        //Hãy tìm “vị trí giá trị âm lớn nhất” trong mảng các số thực (vtamlonnhat).
        // Nếu mảng không có giá trị âm thì trả về -1
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước mảng n= ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.printf("\nNhập sai, nhập lại kích thước mảng");
            System.exit(0);
        }
        //-----------input array--------------------
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ", i);
            arr[i] = in.nextInt();
        }
        in.close();
        //-----------display array-------------------
        System.out.printf("\nMảng vừa tạo là = ");
        for (int value : arr) {
            System.out.printf("%d\t", value);
        }
        //-- xác định xem có giá trị âm hay không
        int value_neg =-1;
        int index_neg=-1;
        boolean flag_neg = false;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < 0) {
                value_neg =arr[i];
                index_neg=i;
                flag_neg=true;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (value_neg < arr[i]) {
                if(arr[i]>=0) continue;
                value_neg = arr[i];
                index_neg = i;
                flag_neg=true;
            }
        }
        if (flag_neg) {
            System.out.printf("\nSố âm max= %d tại vị trí %d", value_neg, index_neg);
            System.exit(0);
        } else {
            System.out.printf("\nKhông tồn tại giá trị thỏa mãn !! return %d", index_neg);
            System.exit(0);
        }
    }
}
