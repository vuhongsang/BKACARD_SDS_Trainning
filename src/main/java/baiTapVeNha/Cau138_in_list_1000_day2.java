package baiTapVeNha;

import java.util.Scanner;

public class Cau138_in_list_1000_day2 {
    public static void main(String[] args) {
        //138.Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số
        //nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả
        //về giá trị là – 1.
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước của array : ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.printf("Nhập lại kích thước của array");
            System.exit(0);

        }
        int[] arr = new int[n];

        //------nhập phần tử con-----------
        System.out.printf("Nhập giá trị các phần tử con của mảng: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ",i);
            arr[i]=in.nextInt();
        }
        in.close();
        //-------in mảng vừa tạo----------------
        System.out.printf("Mảng vừa tạo là : ");
        for (int value : arr) {
            System.out.printf(value+"\t");
        }
        //vị trí chẵn đầu tiên
        //output : tồn tại --> vị trí
        //output : không tồn tại --> -1
        int location=-1;
        boolean flag_noDiv2=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                flag_noDiv2=false;
                location=i;
                break;
            }
        }
        if (flag_noDiv2) {
            System.out.printf("\nKhông tồn tại số chẵn: %d", location);
            System.exit(0);
        } else {
            System.out.printf("\nTồn tại số chẵn, vị trí arr= %d",location);
            System.exit(0);
        }
    }
}
