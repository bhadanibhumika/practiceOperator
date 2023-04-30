import java.util.Scanner;

public class IfElseTest {
    //creat scanner object
    Scanner scanner = new Scanner(System.in);
    public void EligibleForVote(){
        System.out.println("Please enter you age in inter value..");
        //storing age in variable using scanner object
        int age = scanner.nextInt();

        if (age >= 18)
        {
            System.out.println(" you are Eligible for vote as your age is :" + age);
        }
        else

        {
            System.out.println(" you are Eligible for vote as your age is :" + age);
        }

    }
    public static void main(String[] args) {
        // creating class object to call non static method in static area
        IfElseTest ifElseTest =new IfElseTest();
        //calling method using class object
        ifElseTest.EligibleForVote();



    }
}