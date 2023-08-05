package day11_stringManipulations;

public class C07_indexOf {

    public static void main(String[] args) {

String str ="Ali topu at, at ali at";

// ali'nin index'i nedir

        System.out.println(str.indexOf("Ali"));

   // at'in indexi nedir

        System.out.println(str.indexOf("at"));

    // op'un indexi nedir

        System.out.println(str.indexOf("op"));
        System.out.println(str.indexOf('a'));

        System.out.println(str.indexOf("a",10));// 10. indexden sonraki "a" ya bakar

        System.out.println(str.indexOf("yusuf")); // -1 verir sayi dondurdugu icin olmayan metne -1 girer

    }






}
