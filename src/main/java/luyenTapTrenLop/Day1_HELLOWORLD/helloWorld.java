package luyenTapTrenLop.Day1_HELLOWORLD;

import java.util.Scanner;

public class helloWorld {

    public static void main(String[] args) {
        // In ra Hello world
        // print line
        System.out.println("Hello world");
        // Thử đoạn mã sau và đưa nhận xét
        System.out.print("Welcome to ");
        System.out.print("Java");
        // Thử và đưa nhận xét
        String name = "BKACAD";
        int year = 2023;
        // Print format
        System.out.printf("Xin chào các bạn đến với khoá học tại %s vào %d", name, year);

        /*
        Tạo 2 biến lưu thông tin tên và năm sinh (2000)
        -> In ra tên và tuổi trên một dòng
        Gợi ý:
         */
        String hoTen="Nguyen Van A";
        int namSinh=2000;
        int tuoi=2023-namSinh;
        System.out.printf("\n Họ tên: %s, năm nay %d tuổi", hoTen, tuoi);

        // nhập 2 số nguyên a,b từ bàn phím sau đó in ra chúng
        //b1: khai báo biến gồm kiểu dữ liệu và tên biến
        int a;
        int b;
        //b2: nhập dữ liệu sử dụng scanner
        Scanner in  = new Scanner(System.in);
        System.out.println("a = ");
        a = in.nextInt();

        System.out.println("b = ");
        b = in.nextInt();

        //dong phan nhap du lieu tu ban phim
        in.close();
        //b3: tính tổng và in
        int t = a + b;
        System.out.printf("%d + %d = %d", a, b, t);
    }
}
