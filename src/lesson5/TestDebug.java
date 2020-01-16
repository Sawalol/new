package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestDebug {
    public static void main (String[] args){
//        String name = "Sasha";
//        System.out.println(name);
//        name = " Sasha Zhydkov";
//        System.out.println(name);
//
//        char a = 'a';
//        System.out.println(a);

        String v1 = "a";
        String v2 = new String ("v2");
        String v22 = new String ("v2");
        String v3 = new String (new char[]{'v','3'});
        String v4 = new String (v1);
        String v5 = new String("some text");
//        metodu string

        System.out.println(v2.length());
        System.out.println(v2.equals(v1)); //false
        System.out.println(v2.equals(v22)); //true
        System.out.println(v1.equals(v1)); //v1v3
        System.out.println(v1.concat(v3));
        System.out.println(v5.toUpperCase()); //caps
        System.out.println(v5.charAt(2)); //simvol po indexu
        System.out.println(Arrays.toString(v5.split("e")));
        System.out.println(v5.substring(2,6));
        System.out.println(v5.indexOf("t"));//kol bukv t

        for(int i = 0; i<v5.length(); i++){
            System.out.println(i + " - " + v5.charAt(i));
        }

        char [] chars = v5.toCharArray();
        for(char c : chars ){
            System.out.println(c);
        }

    }
}
