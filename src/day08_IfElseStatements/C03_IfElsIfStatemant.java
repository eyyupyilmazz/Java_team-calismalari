package day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElsIfStatemant {

    public static void main(String[] args) {

/*
Ogrencinin notu 85 ve ustu ise AA,
(85 ve ustu degilse) 65 ve ustu ise BB,
(65 ve ustu de degilse) 50 ve ustu ise CC,
(geriye kalanlar)
 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen notunuzu giriniz");

        double not = scanner.nextDouble();

         if (not >= 85) {
            System.out.println("AA");
        } else if (not >= 65) {
            System.out.println("BB");
        } else if (not >= 50) {
            System.out.println("CC");
        } else System.out.println("dd");


    }


}
