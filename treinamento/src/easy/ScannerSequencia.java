package easy;

import java.util.Scanner;

public class ScannerSequencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int exp = 0;
            for(int j=0; j<n; j++) {
                exp += (Math.pow(2, j) * b);
                System.out.printf((a + exp) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
