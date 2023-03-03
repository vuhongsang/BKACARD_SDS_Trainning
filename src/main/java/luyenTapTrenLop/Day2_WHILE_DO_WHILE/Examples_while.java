package luyenTapTrenLop.Day2_WHILE_DO_WHILE;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Examples_while {
    public static void main(String[] args) {
        // nhập chuỗi từ bàn phím --> in ra chuỗi viết hoa
        // chương trình dừng khi người nhập exit
        // a --> A
        // bkacad --> BKACAD
        // exit --> thoát exit

        String s = "";
        Scanner in = new Scanner(System.in);
            while (true) {
                //s.equals so sanh chuoi
                System.out.printf("\n Nhập chuỗi :  ");
                s = in.nextLine();

                if (s.equalsIgnoreCase("exit")){
                    //thoát khỏi vòng lặp
                    break;
                }

                s = s.toUpperCase();
                System.out.printf("Viết hoa : "+ s);
            }
        in.close();
        }


    }

