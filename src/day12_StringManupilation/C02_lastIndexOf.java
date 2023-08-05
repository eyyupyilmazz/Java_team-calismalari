package day12_StringManupilation;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        // a harfinin ilk kullanim index'ini yazdirin

        System.out.println(str.indexOf("a"));

        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("J")); // J HARFININ ILK INDEXI


        System.out.println(str.lastIndexOf("J"));// SONDAN SAYDIK YINE SIFIR TEK J OLDUGU ICIN

        // METNE BAKMADAN E HARFININ 2 KERTE VEYA DAHA FAZLA KULLANILIP KULLANILMADIGINI YAZZINIZ

        int ilkIndex = str.indexOf("e");
        int sonIndex = str.lastIndexOf("e");

        if (ilkIndex == -1) {

            System.out.println("hic e kullanilmamis");
        } else if (ilkIndex == sonIndex) {
            System.out.println("sadece bir kere kullanilmis");
        } else {

            System.out.println("e harfi eki kere veya daha fazla kullanilmistir");
        }


        // "Javayi ogrenecegiz, baska yolu yok";
        // o harfinin son index'ini yazdirin
        System.out.println(str.lastIndexOf("o")); // 32
        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("o", 31)); // 27
        // k harfinin son kullaniminin indexini yazdiralim
        System.out.println(str.lastIndexOf('k')); // 33
    }


}
