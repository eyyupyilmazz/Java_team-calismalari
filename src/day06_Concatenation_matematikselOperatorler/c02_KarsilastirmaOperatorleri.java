package day06_Concatenation_matematikselOperatorler;

public class c02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

    int a=10;
    int b =20;
    // javada tek = isareti karsilastirma degil atama isaretidir (asigment)
    b=2*a;
    // Java'da esitligi == saglar

        System.out.println(b== 2*a); // true
// asigment da esitligin sol tarafinda sadedce variable bulunur


        System.out.println(3*b>5*a); // true

        System.out.println(b>= b-a); //true

        System.out.println(a<= b-a); //true
// java'da karsilastirma operatorlerden kullanilan ! isareri boolean degeri tersine cevirir

        System.out.println(!  (a<b )  );    //false

        System.out.println(a != b);  //true




    }

}
