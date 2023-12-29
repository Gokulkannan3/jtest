import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number =sc.nextLong();
        long originalNumber = number;
        int n = String.valueOf(number).length();
        long result = 0;

        while (originalNumber != 0) {
            long remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}