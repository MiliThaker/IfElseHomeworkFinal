import java.util.Scanner;
public class InterchangeValue
{
 //declaring variables
       int a,b;
    //function to interchange the value
    public void interchange(InterchangeValue itn)
    {
        int x;
        //logic for interchange
        x= itn.a;
        itn.a=itn.b;
        itn.b=x;
    }
    public static void main(String[] args) {
      //creating object of the class
        InterchangeValue interchangeValue =new InterchangeValue();
        Scanner scanner=new Scanner((System.in));
        System.out.println("Enter the value for a");
        interchangeValue.a=scanner.nextInt();
        System.out.println("Enter the vale for b");
        interchangeValue.b=scanner.nextInt();
        interchangeValue.interchange(interchangeValue);
        //print result after interchange
        System.out.println("interchange: a=  " + interchangeValue.a + " and b= " + interchangeValue.b);
    }
}
