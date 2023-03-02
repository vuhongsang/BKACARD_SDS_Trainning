package baiTapVeNha;

import java.util.Scanner;

public class Cau97_in_List_1000 {
    public static void main(String[] args) {
        //Viết chương trình nhập 3 cạnh của một tam giác. Hãy cho biết đó là tam giác gì
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập 3 cạnh a,b,c của tam giác: ");
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();
        in.close();
        if(a==b&&b==c){
            System.out.printf("đây là tam giác đều");
            System.exit(0);
        }
        if(a==b || b==c ||c==a ){
            System.out.printf("đây là tam giác cân");
            System.exit(0);
        }
        if(((a*a + b*b) == c*c)||((a*a + c*c) == b*b)||((c*c + b*b) == a*a)){
            System.out.printf("đây là tam giác vuông");
            System.exit(0);
        }
        if( (a==b||b==c||c==a) && (((a*a + b*b) == c*c)||((a*a + c*c) == b*b)||((c*c + b*b) == a*a)) ){
            System.out.printf("đây là tam giác vuông cân");
            System.exit(0);
        }
    }
}
