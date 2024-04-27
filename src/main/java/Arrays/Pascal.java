package Arrays;
import java.util.Scanner;
public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Element you want to print : ");
        int n = sc.nextInt();
        int[][] triangle = new int[n][n];
        for(int i=0;i<n;i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
         for(int i=0;i<n;i++) {
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=0; k<=i;k++) {
                System.out.print(triangle[i][k] + " ");
            }
             System.out.println();

            }
        }
    }
