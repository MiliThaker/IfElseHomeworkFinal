import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        int number;
        //creating object
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre the number");
        number=scanner.nextInt();
        //logic t get the result
        if(number>0){
            System.out.println(" Positive ");
        }
        else if(number==0){
            System.out.println("Zero");
        }
        else {
            System.out.println("Negative");
        }
    }
}
