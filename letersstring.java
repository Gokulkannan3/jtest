import java.util.*;
public class letersstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        int c=0;
        for (String i:s1){
            c=c+1;
        }
        System.out.println(c);
    }
}
