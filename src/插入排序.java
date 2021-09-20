
import java.util.Scanner;
public class 插入排序 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=0;
        int[] a=new int[10];
        int temp=0;
        for(k=0;k<10;k++)
        {
            a[k]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            for(int j=i;j>0&&a[j]<a[j-1];j--){
                temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
            }
        }for(k=0;k<10;k++){
            System.out.print(a[k]);
            System.out.print(" ");}
    }
}
