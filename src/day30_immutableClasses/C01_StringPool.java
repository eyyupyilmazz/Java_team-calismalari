package day30_immutableClasses;

public class C01_StringPool {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String a = "Ja";
        String b = "va";
        String str5 = a+b;
        String str6 = a.concat(b);


        System.out.println(str1==str2);// true

        System.out.println(str1==str3);//false

        System.out.println(str1==str4);//true
        System.out.println(str1==str5);//false
        System.out.println(str1==str6);//false




    }



}
