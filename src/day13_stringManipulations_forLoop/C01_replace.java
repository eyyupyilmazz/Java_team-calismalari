package day13_stringManipulations_forLoop;

public class C01_replace {

    public static void main(String[] args) {
        String str= "Javayi anliyorum ama yazamiyorum";

        // var olan stringin istediginiz bolumunu degistirebilirsiniz

        System.out.println(str.replace('J', 'T'));

        System.out.println(str.replace('a', '*'));

        System.out.println(str.replace("ama yazamiyorum", "ve yazabiliyorum"));

        System.out.println(str.replace("Java", "AA"));

    }




}
