import java.util.Scanner;
public class 冒泡排序 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        for(int k=0;k<10;k++){
            a[k]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0;k<10;k++){
            System.out.print(a[k]);
            System.out.print(" ");
        }

    }
}
