package luyenTapTrenLop.Day2_BREAK_CONTINUE;

public class Examples_continue {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.printf(i+"\t");
        }
    }
}
