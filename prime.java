import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = (int)Math.sqrt(n);
        for (int i=2;i<=a;i++){
            if(n%i==0) {
                System.out.println("Not a prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
