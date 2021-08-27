package easy;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        int cont = 1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(cont + " " + sc.nextLine());
            cont++;
        }
        sc.close();
    }
}
