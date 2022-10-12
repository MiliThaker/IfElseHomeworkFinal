import java.util.Scanner;

public class LeapYear {
    //creating main method
    public static void main(String[] args){
        int year;
        System.out.println("Enter an Year");
        //creating object using scanner to print output in console
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        //using if else method to get the result
        if (year % 4 == 0)
            System.out.println("This year is a leap year");
        else
            System.out.println("This year is not a leap year");
    }
}