package day07_IfStatement;

import java.util.Scanner;

public class C08_IfElsStatement {

    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println(" ucgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2&& kenar2==kenar3 && kenar1>0){

            System.out.println("eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }



    }


}
