import java.util.Scanner;

public class TernaryOperator
{
    public static void main(String[] args)
    {
        //scanner object created
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        //ternary operator to check number
        String test=number%2==0 ? "Even" : "Odd";
        System.out.println(number + " is " + test);
    }
}
