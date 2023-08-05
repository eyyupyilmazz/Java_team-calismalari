package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        //kullanicidan gun numarasi alip, hafta ici ve hafta sonu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("gun numarasi giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("girilen sayi 1 ile 7 arasinda olmalidir");

        }


    }


}
