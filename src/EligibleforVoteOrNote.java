import java.util.Scanner;
public class EligibleforVoteOrNote {
    //main method
    public static void main(String[] args) {
        //declaring variable
        int age;
        //creating the object using scanner to print output in console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre your Age");
        age=scanner.nextInt();
        //using if else to get the result
        if (age>=18){
            System.out.println("You're Eligible for Vote");
        }
        else if ((age<18)&&(age>0)) {
            System.out.println("You're not Eligible for Vote");

        }
else {
            System.out.println("You're not born yet");
        }
    }
}
