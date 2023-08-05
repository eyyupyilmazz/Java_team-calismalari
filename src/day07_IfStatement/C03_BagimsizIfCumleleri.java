package day07_IfStatement;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

   // lutfen kullanicidan bir tam sayi alin
   // sayiyi kontrol edip 5 ile bvolunebiliyirsa sayi 5 e bolunur yazdirin


        Scanner scanner=new Scanner(System.in);

        System.out.println(" lutfen bir tam sayi giriniz");

        int girilenSayi =scanner.nextInt();


   if (girilenSayi%5==0) System.out.println("sayi 5 ile bolunur");

    }




}
