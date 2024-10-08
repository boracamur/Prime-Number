import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asalMi = false;
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            } else {
                asalMi = true;
            }
        }
        if (asalMi == false) {
            System.out.println(sayi + " Sayısı asal değildir.");

        }else {
            System.out.println(sayi + " Sayısı asaldır.");
        }
    }
}