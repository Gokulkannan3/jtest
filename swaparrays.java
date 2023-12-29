import java.util.*;
public class swaparrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size");
        int n = sc.nextInt();
        System.out.println("Elements of first array");
        int[] a =new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Elements of second array");
        int[] b = new int[n];
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }
        System.out.println("Array 1");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Array 2");
        for(int i=0;i<n;i++) {
            System.out.print(b[i]+" ");
        }
    }
}
