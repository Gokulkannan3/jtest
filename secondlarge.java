import java.util.*;
public class secondlarge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(a[j-1] > a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[1]);
    }
}
