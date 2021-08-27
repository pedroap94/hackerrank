package easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stdin2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s = scan.nextLine();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        } catch (InputMismatchException e){
            System.out.println("Error in enter type. \n" + e);
        }
    }
}
