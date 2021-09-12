import java.util.Scanner;
public class 一生能过几个闰年 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入你的出生年月: ");
        int num=0;
        int year=scan.nextInt();
        for(int i=year;i<=year+100;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                num++;}
        }System.out.println(num);
    }

}
