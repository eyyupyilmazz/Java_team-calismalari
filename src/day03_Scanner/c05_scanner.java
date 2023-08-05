package day03_Scanner;

import java.util.Scanner;

public class c05_scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen dikdortgenin iki kenarini giriniz");

        double kenar1= scanner.nextDouble();

        double kenar2 = scanner.nextDouble();

        System.out.println("dikdortgenin alani : " + kenar2* kenar1);


    }




}
