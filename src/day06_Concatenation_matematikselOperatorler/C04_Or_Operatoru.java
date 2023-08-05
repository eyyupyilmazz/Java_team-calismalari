package day06_Concatenation_matematikselOperatorler;

public class C04_Or_Operatoru {

    public static void main(String[] args) {

 /*or operatoru iyimserdir
 yani tek bir true bile yeterli olur
 or operatorunde tum mantiksal ifadeler false ise sonuc false
 degilse sonuc true'dur
    or operatoru matematikteki toplama islemine benze
    toplana sayilarda bir tane bile 0 olmayan varsa, sonuc sifir olmaz.
  */
        System.out.println(3 > 5 || 6 > 4); //true
        int sayi = 24;
        System.out.println(3 < 5 || 6 > 4); // true
        System.out.println(3 < 5 || 6 < 4); //
        System.out.println(sayi % 3 == 0 || sayi % 5 == 0);   //true

// sayi 0 dan buyuk veya yuzden bkucuk olmalidir.

        System.out.println(sayi > 0 || sayi < 100);//true







    }


}