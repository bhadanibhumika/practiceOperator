import javax.crypto.spec.PSource;
import java.util.Locale;

public class Operators {
    static int a =10;
    static int b = 10;
     static int c =14;

     static String name = "rajesh";
     static String name1 ="I AM living in london";
     static String name2 ="Rajesh";

    public static void main(String[] args) {
      //  System.out.println(name.toUpperCase());
      //  System.out.println(name1.toLowerCase());
      //  String[] parts = name1.split(" ");
     //   System.out.println(parts[0]);
      //  System.out.println(parts[1]);
       // System.out.println(parts[2]);
       // System.out.println(parts[3]);
      //  System.out.println(parts[4]);
    System.out.println(name1.replaceAll("I AM","she is"));
        System.out.println(name1.startsWith("I"));
        System.out.println(name1.endsWith("o"));
        System.out.println(name.contains("g"));
        System.out.println(name.compareTo(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.equals(name2));




       // System.out.println("raj\tesh");//\t means tab = 1space
       // System.out.println("raj\besh");// \b means backspace = 1 latter delete
      //  System.out.println("raj\nesh");// \n means new  line start
       // System.out.println("raj\resh");// \r remain right side delete left side
     //   System.out.println("raj\'esh"); // \'add single quot
       // System.out.println("raj\"esh");  //\" add single quot
     //   System.out.println("raj\\esh"); // add backward slash


       // System.out.println(b%a);
       // System.out.println(a++);//10
       // System.out.println(a); //11
       // System.out.println(++a);//12 //

       // System.out.println(--b);//16
       // System.out.println(b--);//16
      //  System.out.println(b);//15
      //  System.out.println(--b);//14

       // System.out.println(a==b);// 10==17 //false ==
       // System.out.println(b==c);//14==14 //true ==

       // System.out.println(a!=b);//a=10 b=10 //FALSE !=
      //  System.out.println(b!=c);//b=10 c=14 //true

       // System.out.println(a>b);//a=10 b=10 // false
        //System.out.println(b<c);//b=10 c=14 // true


       //System.out.println(a>=b);//one condition true output will true
       // System.out.println(c<=b);//false

        //logical operator
        //logical and &&

       // System.out.println((a==b) && (b<c)); //both condition should be true output true
        //System.out.println((a>b) && (b<c)); //false

        // logicale or ||
       // System.out.println((a==b)||(b<c));// one condition true then out put true
        //System.out.println((a<b) || (b>c));// false


        // logical not !
       // System.out.println(! (a==b));// inside bracket condition true but ! not sing mens output  false

        //assignment operator
        //int d =a+b;

       //System.out.println(d);// assign for c value
       // System.out.println(c=a+b);

       // System.out.println(c+=a);// c=a+c so c value is change
       // System.out.println(c-=a);//c=a-c














    }
}
