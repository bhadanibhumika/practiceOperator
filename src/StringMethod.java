public class StringMethod {
    static  String name = "Bhumika";
    static String surname = "Bhadani";
    static String sentence = "Hello my friend devangi";
    static String  value ="£204,5";
    static double  amount = 343.00;
    static int answer;
    public static void main(String[] args) {

        String amountText = String.valueOf(amount); //another method to convert String into int/double
        System.out.println(amountText);// this is convert in String
       // String value1 =value.replaceAll("£","");
      //  System.out.println(value1);
     //  String value2 =value1.replaceAll(",","");
     //   System.out.println(value2);
     //  double amount2 = Double.parseDouble(value2);
     //  System.out.println(amount2);// this is convert in double
     //   System.out.println(amount2*2);



       System.out.println(value.replaceAll(",",""));
        System.out.println(name.contentEquals( surname));
        System.out.println(name.format(surname));
        System.out.println(name.isEmpty());//false
        System.out.println(sentence.lastIndexOf("devangi"));
        System.out.println(name.replace("u",""));
        System.out.println(name.replaceFirst("B",""));












    }
}
