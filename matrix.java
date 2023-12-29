import java.util.*;
public class matrix {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        int c= sc.nextInt();
        int rr= sc.nextInt();
        int cc= sc.nextInt();
        if(r!=cc){
            System.out.println("Multiplication not possible");
            return;
        }
        int a[][] = new int[r][c];
        int b[][] = new int[rr][cc];
        System.out.println("Enter matrix 1 ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2");
        for(int i=0;i<rr;i++){
            for(int j=0;j<cc;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int result[][] = new int[r][cc];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < cc; j++) {
                for (int k = 0; k < c; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Result matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < cc; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
