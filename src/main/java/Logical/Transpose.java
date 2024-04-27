package Logical;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int [][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                System.out.print("Enter the Numbers : ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe Matrix is : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nThe Transpose of a Matrix is : ");
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

    }
}
