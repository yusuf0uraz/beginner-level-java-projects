import java.util.Scanner;

public class AsalSayiBulmaUygulamasi {

	public static boolean Asalmi(int sayi) {

		if (sayi == 0) {

			return false;

		}

		if (sayi > 0) {

			for (int i = 2; i < Math.sqrt(sayi); i++) {

				if (sayi % i == 0) {

					return false;

				}

			}

		} else {

		}

		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("KONTROL EDİLCEK SAYIYI GİRİNİZ : ");

		int sayi = sc.nextInt();

		if (sayi < 0) {

			System.out.println("Negatif tam sayılar asal olamazlar");

		} else {

			if (Asalmi(sayi)) {

				System.out.println("Bu Sayı ASALDIR. ");

			} else {

				System.out.println("Bu Sayı ASAL DEĞİLDİR. ");

			}

		}

	}

}