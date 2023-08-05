package day03_Scanner;

import java.util.Scanner;

public class c07_Swap {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("lutfen ilk sayiyi giriniz");

    int ilkSayi = scanner.nextInt();

        System.out.println("lutfen ikinci sayiyi giriniz");

   int ikinciSayi =scanner.nextInt();


   int temp= ilkSayi;

    ilkSayi= ikinciSayi;

    ikinciSayi = temp;

        System.out.println("ilk sayi : " + ilkSayi + " ikinci sayi :" +ikinciSayi);

    }




}
