package day_09NestedIfElseStatements;

import java.util.Scanner;

public class c05ternary {

    public static void main(String[] args) {

       // soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
       //   ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdir

        Scanner scanner =new Scanner(System.in);

        System.out.println(" ucgenin 3 kenar uzunlugunu giriniz");

   double kenar1 =scanner.nextDouble();
   double kenar2 =scanner.nextDouble();
   double kenar3 =scanner.nextDouble();

        System.out.println(kenar1== kenar2 && kenar1==kenar3 && kenar1>0 ? "eskenar ucgen"  : "eskenar degil");





    }










}
