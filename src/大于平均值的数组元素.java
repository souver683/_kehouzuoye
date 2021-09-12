import java.util.Scanner;
public class  大于平均值的数组元素{
    public static void main(String[] args) {
        System.out.print("亲你输入一个数字a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int sum = 0,i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        double pj;
        pj = sum / a;
        for(i=0;i<arr.length;i++){
            if (arr[i] > pj)
                System.out.println(arr[i]);}
    }
}