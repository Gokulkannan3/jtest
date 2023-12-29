import java.util.*;
public class rohombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i, j;
        for (i=1; i<=rows; i++)
        {
            // Print trailing spaces
            for (j=1; j<=rows - i; j++)
                System.out.print(" ");

            // Print stars after spaces
            for (j=1; j<=rows; j++)
                System.out.print("*");

            // Move to the next line/row
            System.out.println();
        }
    }
}
