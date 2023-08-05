package day07_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C09__Ornekler {

    public static void main(String[] args) {

   /*
   Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin, yoksa emekli olmasi icin calismasi
   gereken yil sayisini yazdirin.
Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.
Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
    */


       /* Scanner scanner= new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");

int yas=scanner.nextInt();

    if (yas>=65){
        System.out.println("emekli olabilirsiniz");}

     else  (yas<65) {System.out.println("emekli olmak icin " +(65-yas)+ " sene calismalisin");

    }*/









        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && +karakter <= 'Z') {
            System.out.println("girilen karakter buyuk harf :" + karakter);

        } else {
            System.out.println("girilen karakter buyuk harf degil");
        }


        /*Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);

        if (karakter >= 'a' && karakter <= 'z') {

            System.out.println("Girilen kucuk harfin yeni hali : " + Character.toUpperCase(karakter));


        }else {
            System.out.println("Girilen karakter : " + karakter);
        }*/



    }
}
