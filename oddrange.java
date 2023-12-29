import java.util.*;
public class oddrange {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int s = sc.nextInt();
        int l = sc.nextInt();
        for (int i=s;i<l;i++){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
    }
}
