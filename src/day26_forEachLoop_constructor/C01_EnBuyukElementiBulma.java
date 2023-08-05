package day26_forEachLoop_constructor;

public class C01_EnBuyukElementiBulma {

    public static void main(String[] args) {

        int[] arr ={1,4,54,78,4,52,13,65,2,4,6,7,145};
        int enBuyukElement =arr[0];

        for (int each:arr
             ) {

            if (each>enBuyukElement){

                enBuyukElement=each;
            }

        }

        System.out.println("Arraydeki en buyuk element : "+ enBuyukElement);

    }




}
