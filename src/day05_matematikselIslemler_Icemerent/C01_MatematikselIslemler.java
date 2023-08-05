package day05_matematikselIslemler_Icemerent;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

   int a  =27;

   int b = 4;

        System.out.println(a/b); // 6 cunku INT  tam sayi verir

    double c= 27;

        System.out.println(c/b); // 6.75 bolunen veya bolen sayidan double olan varsa sonucu doubke olarak verir.

        System.out.println(2567/10); //256

        System.out.println(2567%10); //7 % (modulus) ile bolme yaparsan kalani yazar buraya

    // a yi b ye bolup sonucu ondalikli yazin
    double sonuc1 = a/b;

        System.out.println("sonuc1 : " + sonuc1); //6

        double sonuc2 =(double) (a/b);//  6  once parantez icini yaptigi icin islemi int goruyor

        System.out.println("sonuc2 : " +sonuc2);

    double sonuc3=(double) a/b;

        System.out.println("sonuc3 : " + sonuc3); // 6.75 a/b parantez icinde yazilmadigi icin islemi double aldi


    }















}
