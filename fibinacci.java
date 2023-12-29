import java.util.*;
public class fibinacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start=0;
        int sec=1;

        for (int i = 0; i < n; i++) {
            System.out.print(start + " ");
            int next = start + sec;
            start = sec;
            sec = next;
        }
    }
}
