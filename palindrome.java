import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int l=0;
        int r=s.length()-1;
        while (l<=r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                System.out.println("It is a not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
