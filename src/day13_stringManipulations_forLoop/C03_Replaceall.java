package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_Replaceall {

    public static void main(String[] args) {

   // kullanicidan bir metin isteyin
        // metindeki tum sayilari ve space disindaki ozel karakterleri temizleyin
        //ornek input: j1*2ava4. ca2ndir4//*


        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen istediginiz mesaji girin");

        String metin=scanner.nextLine();


        // once sayilardan kurtulalim
       metin = metin.replaceAll("\\d",""); // J*av.a C/an=+dir--
        // ozel karakterlerden kurtulmak istedigimizde, space de kaybolur
        // bunun icin once space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun icin space yerine herhangi bir sayiyi atayalim
        metin = metin.replaceAll("\\s","1");
        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W",""); // Java1Candir
        // space yerine atadigimiz 1'i yeniden space yapalim
        metin = metin.replaceAll("1"," "); // Java Candir
        metin = metin + ".";
        System.out.println(metin); // Java Candir.

    }


}
