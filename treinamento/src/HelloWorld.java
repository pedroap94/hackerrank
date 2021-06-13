import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        if(i<=100){
            if (i%2 != 0) {
                System.out.println("Weird");

            }
            else{
                if(6<=i && i<=20){
                    System.out.println("Weird");
                }else{
                    System.out.println("Not Weird");
                }
            }
        } else{
            throw new Exception("Number only 0 to 100");
        }
        sc.close();
    }
}
