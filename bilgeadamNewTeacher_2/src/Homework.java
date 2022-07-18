import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Sandalye \n2.Masa \n3.Bilgisayar \n4.Fare \n5.Yazıcı \n6.Sepet tutarını Hesapla");
        System.out.println("Sepete Eklemek istediğiniz ürünü seçiniz :");
        int number =scanner.nextInt();
        if(number<1 || number >6){
            do {
                System.out.println("Hatalı Seçim!!!! Lütfen Tekrar seçim Yapınız.");
                System.out.println("1.Sandalye \n2.Masa \n3.Bilgisayar \n4.Fare \n5.Yazıcı \n6.Sepet tutarını Hesapla");
                System.out.println("Sepete Eklemek istediğiniz ürünü seçiniz :");
            }while(number<1 || number >6);
            System.out.print("Lütfen adet miktarını yazınız: ");
        }
    }
}
