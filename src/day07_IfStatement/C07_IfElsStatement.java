package day07_IfStatement;

import java.util.Scanner;

public class C07_IfElsStatement {

    public static void main(String[] args) {

    // kullanicidan notunu isteyin 50 ve uzeri ise sinifi gectin degilse maalesef kaldin yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen notunuzu giriniz");

    double not = scanner.nextDouble();

    if( not>= 50) System.out.println("sinifi gectin");


    if (not<50) System.out.println("maalesef kaldin");


        /*
            Eger bir sart icin sadece 2 durum soz konusu ise
            iki durumu ayri ayri kontrol etmek yerine
            tek bir kontrol ile de yapabiliriz
            Bagimsiz if cumlelerinden farkli olarak
            if else cumlelerinde
            ya if body'si, ya else body'si calisir
            IKISININ BIRDEN calismasi mumkun olmadigi gibi,
            IKISININ DE CALISMAMASI mumkun degildir.
         */




    if (not>=50){
    System.out.println("sinifi gectin");

}else {
    System.out.println("maalesef kaldiniz");
}



    }




}
