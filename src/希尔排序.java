import java.util.Scanner;
public class 希尔排序 {
    public static void main(String[] args) {
        int key,fnc,i,j;
        Scanner sc=new Scanner(System.in);
        int[] a=new int[8];
        int temp=0;
        for(int k=0;k<a.length;k++){
            a[k]=sc.nextInt();
        }
        for(fnc = a.length / 2;fnc>0;fnc /=2){
            for(i = fnc;i < a.length; i++){
                for (j = i - fnc; j >= 0; j -= fnc) {
                    if(a[j] > a[j + fnc])
                    {temp = a[j];
                        a[j] = a[j + fnc];
                        a[j + fnc] = temp;}
                }}
        }for(int k=0;k<a.length;k++){
            System.out.print(a[k]);
            System.out.print(" ");}
    }}
