package luyenTapTrenLop.Day1_HELLOWORLD;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        // math.pow(a,b)
        //math.pow(3, 2) tuong ung 3^2
        //tinh trung binh cong 3 so
        //-------------------------
        float x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        x = in.nextFloat();
        System.out.print("y = ");
        y = in.nextFloat();
        System.out.print("z = ");
        z = in.nextFloat();
        float tbc = (x+y+z)/3;
        System.out.printf("trung binh cong 3 so la: %.2f", tbc);
        in.close();
        //------------------------------
    }
}
