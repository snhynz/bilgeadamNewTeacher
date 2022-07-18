import java.util.Scanner;

public class ExampleFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = scan.nextInt();
        if (number%2 == 0 ){
            System.out.println("The Number İs Even Number");
        }else {
            System.out.println("The Number İs Odd Number");
        }

    }
}
