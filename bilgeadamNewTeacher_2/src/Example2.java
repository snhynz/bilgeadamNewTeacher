import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter First Child Age : ");
        int age = scan.nextInt();
        System.out.print("Enter second Child Age : ");
        int age2 = scan.nextInt();

        if (age>age2){
            System.out.println("First Child Greater");
        }
        else if (age==age2){
            System.out.println("equals");
        }
        else{
            System.out.println("Second Child Greater");
        }

    }
}
