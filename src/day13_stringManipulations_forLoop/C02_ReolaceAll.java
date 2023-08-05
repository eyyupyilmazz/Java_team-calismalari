package day13_stringManipulations_forLoop;

public class C02_ReolaceAll {

    public static void main(String[] args) {
        String str="1Ja4va 8C9a2n5d1i1r";

   str=str.replace("1","");

        System.out.println(str);//Ja4va 8C9a2n5d1ir

   str=str.replaceAll("\\d","");

        System.out.println(str);
  /*
        Regex (Regular Expressions)
            \\s : space     \\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits        \\D : digit olmayan hersey
            \\w : harf veya rakam   \\W : harf veya rakam olmayan hersey
         */


    }


}
