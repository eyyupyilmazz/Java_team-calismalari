package day05_matematikselIslemler_Icemerent;

public class C03_Incerment_Decrement {

    public static void main(String[] args) {

    int sayi=10;

    // sayi variable'nin 2 katinin 5 fazlasini yapin

    sayi=  2*sayi+5;

        System.out.println(sayi);

    // ikinci yontemle yaparsak
    sayi=10;
    sayi*=2;

   sayi+=5;

        System.out.println(sayi);

    int a= 10;

     // a'nin degerini yeni olusturdugumuz b'ye atayip sonra a'nin degerini bir artirin

    // ave b yi yazdirin

   int b= a;
   a++;
        System.out.println("a : " +a + " b : " +b);

    a=10;

    // a'nin degerini bir artirin' sonra a'nin degerini b'ye atayin

    a++;

    b=a;

        System.out.println("a : " +a+" b : " +b);

    }



}
