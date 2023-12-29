import java.util.*;
public class Kth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Kth element");
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==k){
                System.out.println(arr[i]);
            }
        }
    }
}
