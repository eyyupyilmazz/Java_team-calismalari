package day14_forLoops;

import java.util.Scanner;

public class C01_sifreKontrolu {

    public static void main(String[] args) {

       /*
        kullanicidan sifre alin asagidaski sartlari kontrol edin
        sartlar saglanirsa sifre basaariyla kaydedildi yazin
        - ilk harf kucuk haer olmali
        -sonkarakte rakam olmali
        -sifre bosluk icermemmeli
        uzunlugu en az on karakter olmali
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

       int sayac=0;
        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk harf kucuk olmali");
            sayac++;

        }
        char sonKarakter = sifre.charAt(sifre.length() - 1);
        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            System.out.println("son karakter rakam olmali");
            sayac++;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
           sayac++;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("sifre en az on karakter olmali");
           sayac++;

        } if (sayac==0){
            System.out.println("sifre basariyla kaydedildi");
        }
        }





    }



