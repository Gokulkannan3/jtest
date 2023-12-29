import java.util.*;
public class symmetric {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the matrix:");
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=a[j][i]){
                    System.out.println("Not Symmetric");
                    return;
                }
            }
        }
        System.out.println("Symmetric");
    }
}
