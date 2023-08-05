package day14_forLoops;

import java.util.Scanner;

public class C08_AsalSayi {
    public static void main(String[] args) {
       //soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen asal sayi kontrolu icin bir tam sayi giriniz");
        int sayi=scanner.nextInt();

    boolean flag=true;
        for (int i = 2; i > sayi; i++) {

       if(sayi%i==0){

           System.out.println("asal degil");
           flag= false;
           break;
       }

        }

    if (flag){
        System.out.println("girilen sayi asal degil");
    }


    }




}
