package day12_StringManupilation;

public class C01_IndexOf {

    public static void main(String[] args) {

        String str = "Ali topu at, topu at ali ";

        // ilk top metin parcasinin indexini yazdirin

        System.out.println(str.indexOf("top"));// 4

        // ikinci metin parcasinin index'ini yazdirin

        System.out.println(str.indexOf("top", 5));//13

        System.out.println(str.indexOf("top", str.indexOf("top") + 1)); // 13

        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun

        int ilkIndex=str.indexOf("at");
        if (ilkIndex==-1){

            System.out.println("2 kere kullanilmamis");

        }else {

      int ikinciIndex= str.indexOf("at",ilkIndex+1);
      if (ikinciIndex==-1){

          System.out.println("ikinci defa kullanilmamis");
      }else {
          System.out.println("2 defa veya daha fazla kullanilmis");
      }

        }


    }


}
