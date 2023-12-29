import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int ecount=0;
        int ocount=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ecount+=1;
            } else{
                ocount+=1;
            }
        }
        System.out.println("Even numbers:"+ecount+" Odd numbers:"+ocount);

    }
}
