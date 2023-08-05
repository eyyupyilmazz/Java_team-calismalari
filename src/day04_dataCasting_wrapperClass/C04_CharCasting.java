package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {
    //kullanicidan bir char isteyin
      //  girilen chardan  sonraki 3 karakteri yazdirin
       // orn: input: a output: b,c,d

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen ascii tablosundan bir karakter  giriniz");

    char girilenKrk= scanner.next().charAt(0);

        System.out.println(" girilen karakter : " + girilenKrk);

        System.out.println("girilen karakterden sonraki 3 karakter : " +(char)(girilenKrk+1) +", " +
                (char)(girilenKrk+2) + ", " + (char)(girilenKrk+3));

    }






}
