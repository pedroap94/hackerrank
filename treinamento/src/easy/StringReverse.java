package easy;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String Areverse = new StringBuilder(A).reverse().toString();
        if(A.equals(Areverse)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
