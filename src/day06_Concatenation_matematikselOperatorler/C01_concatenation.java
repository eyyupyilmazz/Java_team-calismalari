package day06_Concatenation_matematikselOperatorler;

public class C01_concatenation {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;

// sadece yukardaki variable'lari kullanarak
// asagida verilen metin'leri yazdirin

        //Java35

        System.out.println(s1 + a + b);

        // java15

        System.out.println(s1 + a * b);

        //8candir

        System.out.println(a + b + s2);
        //53java
        System.out.println(s4 + b + a + s1);

        // 35 java

        System.out.println(s4 + a + b + s3 + s1);

        System.out.println(a + s4 + b + s3 + s1);


    }


}
