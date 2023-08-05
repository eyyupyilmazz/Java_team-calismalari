package day03_Scanner;

import java.util.Scanner;

public class c08_swap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen ilk sayiyi giriniz");

    int ilkSayi =scanner.nextInt();

        System.out.println("lutfen ikinci sayiyi giriniz");

    int ikinciSayi = scanner.nextInt();

    ikinciSayi = ilkSayi+10;

    ilkSayi = ikinciSayi-10;

        System.out.println("ilk sayi : " + ikinciSayi + " ikinci sayi : " + ilkSayi);

    }





}
