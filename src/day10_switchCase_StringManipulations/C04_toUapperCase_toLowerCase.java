package day10_switchCase_StringManipulations;

import java.util.Locale;

public class C04_toUapperCase_toLowerCase {

    public static void main(String[] args) {

        String str= "Java candir";

        System.out.println(str.toUpperCase());//JAVA CANDIR

str=str.toUpperCase();

        System.out.println(str.toLowerCase());//java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));// java candir
    }







}
