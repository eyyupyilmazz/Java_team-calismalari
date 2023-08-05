package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen isminizi yaziniz");

        String girilenIsim = scanner.nextLine();

        System.out.println("lutfen soyisminizi giriniz");

        String girilenSoyisim = scanner.nextLine();

        System.out.println("lutfen yasinizi giriniz");

        int girilenYas = scanner.nextInt();

        System.out.println("isminiz : " + girilenIsim);

        System.out.println("soyisminiz :" + girilenSoyisim);

        System.out.println("yasiniz : " + girilenYas);

        System.out.println("kaydiniz basariyla tamamlanmistir");


   /*  sout ıcerısınde bır strıngın alt satırdan devam edılmesını ıstersenız
    strıngın alt satıra gecmesını ıstedıgınız kısmında  \n yazin
    */

        System.out.println("Isminiz : " + girilenIsim + "\nSoysiminiz : " + girilenSoyisim + "\nYasiniz : " + girilenYas + "\nKaydiniz basariyla tamamlanmistir");


    }


}
