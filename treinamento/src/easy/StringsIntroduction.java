package easy;

import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int len = A.length() + B.length();
        System.out.println(len);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.charAt(0). + " " + B);
    }
}
