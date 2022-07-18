import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Note : ");
        int note = scan.nextInt();

        if (note >=85){
            System.out.println("Your Note '5'");
        }
        else if(note<85 && note >=70){
            System.out.println("Your Note '4'");
        }
        else if(note<70 && note >=60){
            System.out.println("Your Note '3'");
        }
        else if(note<60 && note >=50){
            System.out.println("Your Note '2'");
        }
        else{
            System.out.println("Your Note '1'");
        }
    }
}


