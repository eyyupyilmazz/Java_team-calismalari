package day05_matematikselIslemler_Icemerent;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        //kullanicidan 3 basamakli bir sayi alip sayinin rakamlarini toplayip  yazdirin
        Scanner scanner= new Scanner(System.in);

        System.out.println("lutfen uc basamakli pozitif bir tam sayi giriniz");

        int girilensayi= scanner.nextInt();

        int birlerBasamagi =0;

        int rakamlarToplami =0;

        // ilk sayi icin birler basamagini bulalim254


        birlerBasamagi = girilensayi%10;

        rakamlarToplami = rakamlarToplami+birlerBasamagi;

        //Birler basamagindaki sayiyi aldik artik ondan kurtulalim

        girilensayi=girilensayi/10;

        //bu satira geldigimizde girilen sayiyi 2 basamakli hale getirdik


        birlerBasamagi =girilensayi%10;

        rakamlarToplami =rakamlarToplami+birlerBasamagi;

        girilensayi= girilensayi/10;

       // buraya geldigimizde artik sayimiz tek basamakli


        birlerBasamagi =girilensayi%10;

        rakamlarToplami =rakamlarToplami+birlerBasamagi;

        girilensayi= girilensayi/10;

        System.out.println("rakamlar  toplami : " +rakamlarToplami);

     }








}
