package luyenTapTrenLop.Day2_WHILE_DO_WHILE;

import java.util.Scanner;

public class Login_user {
    public static void main(String[] args) {
        String user_name="";
        String user_pass="";
        String admin_name="admin";
        String admin_pass="admin";
        Scanner in=new Scanner(System.in);
        int input_count=0;
        while (true){
            System.out.printf("Hãy nhập username : ");
            user_name=in.nextLine();
            System.out.printf("Hãy nhập passord : ");
            user_pass=in.nextLine();
            if (user_name.equals(admin_name)&&user_pass.equals(admin_pass)){
                System.out.printf("Đăng nhập thành công !!");
            }
            else {
                System.out.printf("sai thông tin, nhập lại");
                input_count++;
            }
            if(input_count==3){
                System.out.printf("đăng nhập thất bại");
                break;
            }
        }

    }
}
