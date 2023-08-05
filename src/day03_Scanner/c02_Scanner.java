package day03_Scanner;

import java.util.Scanner;

public class c02_Scanner {

    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        System.out.println("lutfen bir tam sayi giriniz");

        int girilenSayi = veri.nextInt();

        System.out.println("Girilen saayinin karesi :" +girilenSayi*girilenSayi);




    }




}
