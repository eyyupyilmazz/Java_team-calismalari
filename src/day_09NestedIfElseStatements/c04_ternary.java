package day_09NestedIfElseStatements;

public class c04_ternary {

    public static void main(String[] args) {

    // input olarak verilen bir sayinin 3 ile bulunup bolunmedigini bulunuz

        int input =20;

        //input % 3==0 ? "3 ile bolunuyor" : "3 ile tam  bolunmuyor"


        System.out.println(input % 3 == 0 ? "3 ile bolunuyor" : "3 ile tam  bolunmuyor");

    String sonuc =input % 3==0 ? "3 ile bolunuyor" : "3 ile tam  bolunmuyor";

        System.out.println(sonuc);
    
    //verilen input cift sayi ise "cift sayi"
    // input tek syai ise 2*input sonucunu veren bir ternary yazin


        System.out.println(input % 2 == 0 ? "cift sayi" : 2 * input);


    }











}
