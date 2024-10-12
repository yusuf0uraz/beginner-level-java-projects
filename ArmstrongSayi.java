package armstrongsayi;
import java.util.Scanner;

public class ArmstrongSayi {
    public static boolean armstrongSayiMi(int sayi, int basamakSayisi) {
        int orijinalSayi = sayi;
        int kuplerToplami = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;
            kuplerToplami += Math.pow(basamak, basamakSayisi);
            sayi /= 10;
        }

        return orijinalSayi == kuplerToplami;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();
            int basamakSayisi = (int) Math.log10(sayi) + 1;

            if (armstrongSayiMi(sayi, basamakSayisi)) {
                System.out.println(sayi + " sayısı bir Armstrong sayısıdır.");
            } else {
                System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
                scanner.close();

            }
        } catch (Exception e) {
            System.out.println("Lütfen geçerli bir tam sayı giriniz.");
        }
    }
}