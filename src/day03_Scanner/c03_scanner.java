package day03_Scanner;

import java.util.Scanner;

public class c03_scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir double sayi giriniz");

        double girilenDouble = scanner.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");

        int girilenInt =scanner.nextInt();

        System.out.println(" iki sayinin toplami : " + (girilenInt+girilenDouble));

        System.out.println("iki  sayinin carpimi : " + (girilenInt*girilenDouble));





    }


}
