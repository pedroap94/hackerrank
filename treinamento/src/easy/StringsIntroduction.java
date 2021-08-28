package easy;

import java.util.Locale;
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
        System.out.println(A.substring(0, 1).toUpperCase(Locale.ROOT) + A.substring(1, A.length()) + " " + B.substring(0, 1).toUpperCase(Locale.ROOT) + B.substring(1, B.length()));
    }
}
