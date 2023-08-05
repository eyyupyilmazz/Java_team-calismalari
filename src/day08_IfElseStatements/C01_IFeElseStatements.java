package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IFeElseStatements {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && +karakter <= 'Z') {
            System.out.println("girilen karakter buyuk harf :" + karakter);

        } else {
            System.out.println("girilen karakter buyuk harf degil");
        }
    }









    }



