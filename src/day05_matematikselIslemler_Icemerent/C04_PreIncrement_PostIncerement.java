package day05_matematikselIslemler_Icemerent;

public class C04_PreIncrement_PostIncerement {

    public static void main(String[] args) {

   // Java'da bir onceki class'da yaptigimiz gibi artirma ve atama, veya artirma ve yazdirma beraber olabilir

    int a =20;
     int b=10;

        System.out.println(b=2*a); //40

        System.out.println(a= b-5); //35

        a= 10;

        // once a'nin degerini b'ye atayin, sonra b'yi arttirin

        b= a++;

        System.out.println("a : " +a + " b : " +b); //a=10 b=11

        // once a'nin degerini bir artirin,sonra anin degerini b'ye atayin
    a=10;
   // a++;
   // b= a;

     b=++a;// kisa yol

        System.out.println("a : " +a + " b : " +b); //a=10 b=11


    /*
    bu kullanim sadeced a++ a-- ++a  --a icin gecerlidir.
    burada ++ veya -- 'yi oncemi sonrami kullanacagimiza bizden istenen duruma gore karar veririz
    artirma once ise ++a
    artirma sonra ise a++
     */
        a=20;
        System.out.println(a++);

        System.out.println(a);

        a=20;

        System.out.println(--a);

        System.out.println(a);


    }




}
