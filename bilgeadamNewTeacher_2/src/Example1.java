import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum;
        System.out.println("Enter First child age : ");
        int age = scan.nextInt();
        System.out.println("First child age : "+ age);
        System.out.println("**********");
        System.out.println("Enter Second child age : ");
        int age2 = scan.nextInt();
        System.out.println("Second child age : "+ age2);
        sum=(age+age2);
        if (sum > 30){
            System.out.println("Okey Bro");
        }
        else{
            System.out.println("Whaaat!!!!");
        }

    }
}
