package day13_stringManipulations_forLoop;

public class C06_ForloopDikkatEdilecekler {

    public static void main(String[] args) {
        // verdigimiz baslangic degeri, bitis sartini saglamazsa
        // forloop calisir ancak forloop badisi devreye girmez


        for (int i = 0; i > 10; i++) {

            System.out.println(i);


        }
   /* baslangic degeri ve degisim sekli hic bir zaman bitis degerine ulasmazsa
        for (int i = 0; i >=0 ; i++) {

        }
   */


        // kullanicinin verdigi baslangic ve bitis degerleri dahil olarak
        // bu sayilarin arasinda aranan sayiya tam bolunebilen bir sayi varsa
        // "aranan sayi ile tam bolunebilen bir sayi var" yazdirin
        int baslangic = 201;
        int bitis = 237;
        int arananSayi = 43;
        for (int i = baslangic; i <= bitis; i++) {
            System.out.println(i);
            if (i % arananSayi == 0) {
                System.out.println("aranan sayi ile tam bolunebilen bir sayi var");
                break;
            }


        }


    }
}