package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElsIfStatement {

    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
    // Sayi 3' e bolunuyorsa 3'un kati
    // sayi 5'e bolunuyorsa 5'in kati
    // ikisine birden bolunuyorsa super sayi yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir tam sayi giriniz");


        int sayi=scanner.nextInt();

    if  (sayi%3==0 && sayi%5==0){

        System.out.println("super sayi");
    } else if (sayi%3==0) {
        System.out.println("3'un kati");
    } else if (sayi%5==0) {
        System.out.println("5'in kati");
    }else System.out.println("gecersiz sayi");


    }









}