package day13_stringManipulations_forLoop;

public class C05_forloop {

    public static void main(String[] args) {
        // kullanicinin verdigi input degerinden baslayip ardisik 10 tam sayi yazdirin

        int input=20;
        for (int i = input; i < input+10; i++) {

            System.out.print(i+ " ");



        }

        System.out.println();
   // kullanicinin verdigi sayidan baslayin yuze kadar 5 er 5 er artirarak yazdirin

        for (int i = input; i <= 100; i+=5) {
            System.out.print(i+ " ");

        }
        System.out.println();
    // 110den baslayip 1e kadar geri gidin 7 nin kati olan sayilari yazdirin

        for (int i = 100; i >=1 ; i--) {

       if (i%7==0){
           System.out.print(i+ " ");
       }
        }

    }



}
