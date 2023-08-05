package day02_dataTurleri_veriable;

import java.util.Locale;

public class c04_stringDataTuru {

    public static void main(String[] args) {

        int sayi= 20;
        System.out.println(sayi); // 20

        String isim = "Berk Yilmaz"; // BERK YILMAZ

        System.out.println(isim.toUpperCase());

        System.out.println(isim.toLowerCase(Locale.ROOT)); // berk yilmaz

        System.out.println(isim); // Berk Yilmaz

            String str1 = "Java " ;

            String str2 = " Candir" ;

        System.out.println(str1 +  str2);

        // iki tane string  + isareti ile toplanmaya calisilirsa java o iki stringi birlestirir

        String  str3 = "30";

         String str4 = "40";
        System.out.println(str3 + str4); // 3040

        // verilen isim ve soyismi
        // Girilen ali  uzunkavak databas'e  kaydedildi
        // seklinde yazdirin

        String adi = "Ramazan";

        String soyadi = " Tatar";

        System.out.println("Girilen " + adi + soyadi + " databas'a kaydedildi");




    }

}
