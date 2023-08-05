package day06_Concatenation_matematikselOperatorler;

public class c03_AndOperatoru {
    public static void main(String[] args) {


        System.out.println(5>3 && 6>4); // true

        System.out.println(5<3 && 6>4); // false

        System.out.println(5>3 && 6<=4);// false

        System.out.println(5<=3 && 6<=4);  // false

   // && operatoru ile baglanan boelen ifadeler kac tane olursa olsun hepsi true ise true,
        // bunun disindaki tum durumlar false

       // bir sayinin hem 2 ile hem 3 hemde 5 ile bolunebilmesi icin.
int sayi=24;



        System.out.println(sayi%2 ==00 && sayi %3 ==00 && sayi% 5 ==0); // false

        System.out.println(sayi>=0 && sayi<=100); //true



    }



}
