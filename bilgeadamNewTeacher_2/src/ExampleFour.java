import java.util.Scanner;

public class ExampleFour {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int number1;
       int number2;
       int number3;
        System.out.print("Please Enter First Number : ");
       number1= scan.nextInt();
        System.out.print("Please Enter Second Number : ");
        number2= scan.nextInt();
        System.out.print("Please Enter Third Number : ");
        number3= scan.nextInt();
        if (number1 > number2 && number1 > number3){
            System.out.print("The Biggest Number İs : " + number1);
        }
        else if (number2 > number1 && number2 > number3){
            System.out.print("The Biggest Number İs : " + number2);
        }
        else if (number3 > number2 && number3 > number1){
            System.out.print("The Biggest Number İs : " + number3);
        }

    }
}
