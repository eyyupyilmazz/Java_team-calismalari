package day07_IfStatement;

import java.util.Scanner;

public class C05_BagamsizIfCumleleri {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println(" ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*
            java'da 3'lu karsilastirma OLMAZ
            ikili karsilastirmalar yapip
            && veya || operatorleri ile birlestirmeliyiz
         */

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0) {

            System.out.println("eskenar ucgen");


        }


    }


}
