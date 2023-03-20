public class StringMethod {
    static  String name = "My name is bhumika";
    static String surname = "Bhadani";
    static String  value ="£204,5";
    static double  amount = 343.00;
    static int answer;
    public static void main(String[] args) {
        //String amountText = String.valueOf(amount); //another method to convert String into int/double
        String value1 =value.replaceAll("£","");
        System.out.println(value1);
        String value2 =value1.replaceAll(",","");
        System.out.println(value2);
        double amount2 = Double.parseDouble(value2);
        System.out.println(amount2);
        System.out.println(amount2*2);


      //  System.out.println(value.replaceAll(",",""));


    }
}
