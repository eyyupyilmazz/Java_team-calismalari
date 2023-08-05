package day02_dataTurleri_veriable;

public class c03_primitiveDataTurleri {

    public static void main(String[] args) {

        boolean bl1= true;

        boolean bl2= false;

        char ch1= 'a' ;

        char ch2= '2';

        char ch3= '/' ;

        // tam sayi kabul edilen variable turleri
       // 3- byte, short, 5 - int 6- long
        // tirkiye' de sehir nufuslarini tutmak istiyoruz.
        // data turu ayni olan  veriable'lerin degerleri ne olursa olsun
        // hafizada kapladiklari alan aynidir
        int nufus  = 834250;

        int nufusBilecik = 30000;

        //bir sehirdeki noter sayisini tutacagiz

        short noterSayisiIstanbul = 456;

        float fl1 = 20f;

        float fl2 = 6f;

        float fl3 = fl1/ fl2 ;

        System.out.println(fl3);

        double db1 =20;

        double db2 =6;

       double db3 = db1 / db2 ;

        System.out.println(db3);

        // double bolme isleminde hata yapabilir 0,000000001 gibi
        //20 / 5 = 3,999999999

        String str = "Hello World" ; // Hello World

        System.out.println(str);
        System.out.println(" true veya false");
        System.out.println("str"); // str

        // verilen iki sayiyi carpip sonucu yazdirin


        int sayi1 =10;

        int sayi2 =20;

        System.out.println(sayi1*sayi2);

        System.out.println("girilen sayilarin carpimi : " + sayi1 * sayi2);

    }




}
