package day04_dataCasting_wrapperClass;

public class c05_wrapperClasses {

    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str.charAt(3)); // a

        int sayi =20;

        /*
        java primitive data turleri icin hazir method olusturmaz
        ancak
        bu primitive data turleri icin kullanilabilecek Wrapper class'lar olusturmustur
        int==> Intiger
        char==> Character
        short==> Short
        double==> Double...
        Wrapper class'lar primitive data turleri ile hic problemsiz atama yapilabilir
         */

    int sayi2 =5;

        Integer sayi3= sayi2;

        int sayi4= sayi3;

        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);

        //short sayi5= (short) sayi3; Wrapper class'lar arasinda casting OLMAZ.

    String str1 ="22";
    String str2= "33";

    //bu degeri toplayip yazdirin

        System.out.println(str1+ str2);// 2233

        System.out.println(Integer.parseInt(str1) +Integer.parseInt(str2));// 55

        char ch1 ='7';

        System.out.println(Character.isDigit(ch1)); // true

        System.out.println(Character.isLetter(ch1)); // false

        System.out.println(Character.isWhitespace(ch1)); // false
    }













}
