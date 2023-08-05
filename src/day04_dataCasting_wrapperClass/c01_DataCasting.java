package day04_dataCasting_wrapperClass;

public class c01_DataCasting {

    public static void main(String[] args) {
    String str = "Java Candir";

    /* char,boolean ve string'i diger data tulerine cast edemeyiz
    sayisal data icereen primitive data turlerini birbirine cast edebliriz

    1-daha kucuk data turundeki degeri,daha genis data turundeki variable'a atama yaparsak java auto wieding yapar
    yani otomatik olarak bunu yapar.

    2-daha genis kapsamli data turundeki degeri, daha dar kapsamli variable'a atama yaparsak java bunu otomatik olarak
    yapmaz

    biz sorumlulugu uzerimize alarak bu casting'i yaptirabiliriz.

    daraltma (Expilicit Narroving) yapildiginda data kayiplari olabilecegi gibi data baskalasabilir de.


     */

    //int sayi1 = str;

   // char chr1 =str;

    // boolean bl1= str;


        String S1 =str;
   // boolean bl2 =10;

    //boolean bl2 = 's' ;
        int sayi2 = 'k';


    double dbl = sayi2;

    int sayi3= 10;

    double dbl2= 4.5;

    short sh1= 3;

    byte by1= 7;

  //sayi3= dbl2

    sayi3= sh1;

   sayi3=by1;

    dbl2 = sayi3;

    dbl2= sh1;

    //by1=dbl2;

    by1= (byte)dbl2;








    }






}
