import java.util.Scanner;
//class
public class FindTheAverage {
    //main method
    public static void main(String[] args) {
        //creating object using scanner to print output in console
        Scanner scanner=new Scanner(System.in);

        System.out.println("Print first number");
        int num1=scanner.nextByte();
        System.out.println("Print second number");
        int num2=scanner.nextByte();
        System.out.println("Print third number");
        int num3=scanner.nextByte();
        System.out.println("Print forth  number");
        int num4=scanner.nextByte();
        System.out.println("Print fifth number");
        int num5 = scanner.nextByte();
        //method to find the average
        System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);


    }
}
