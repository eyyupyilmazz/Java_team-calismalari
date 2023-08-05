package day_09NestedIfElseStatements;

import java.util.Scanner;

public class c07_tternary {

    public static void main(String[] args) {

       // kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin


        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz");

    double sayi=scanner.nextDouble();

        System.out.println(sayi>0 ? sayi : -1*sayi);







    }









}
