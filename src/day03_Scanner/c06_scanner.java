package day03_Scanner;

import java.util.Scanner;

public class c06_scanner {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("lutfen cemberin yaricapini giriniz");

        double yaricap= scanner.nextDouble();

        System.out.println("cemberin cevresi : " +2*3.14*yaricap);

        System.out.println("dairenin alani : " + 3.14*yaricap*yaricap);


    }






}
