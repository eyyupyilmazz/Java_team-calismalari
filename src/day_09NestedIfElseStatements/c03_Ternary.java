package day_09NestedIfElseStatements;

import java.util.Scanner;

public class c03_Ternary {

    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);

        System.out.println("lutfen pozitif bir tamsayi giriniz");

  int sayi= scanner.nextInt();

        System.out.println( sayi% 2== 0 ? "cift saayi" : "tek sayi");


if (sayi%2==0 && sayi>0){

    System.out.println("cift sayi");
}else {
    System.out.println("tek sayi");
}




    }









    }

















