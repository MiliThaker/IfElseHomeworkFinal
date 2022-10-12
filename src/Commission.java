import java.util.Scanner;
//created the class
public class Commission {
    //main method
    public static void main(String[] args) {
        //declaring variable
        String name;
        float id,salary;
        //creating object using scanner to print output in console
        Scanner scanner=new Scanner(System.in);

        System.out.println("Seller's name");
        name=scanner.nextLine();
        System.out.println("Entre your ID");
        id=scanner.nextInt();
        System.out.println("Entre your Salary");
        salary=scanner.nextInt();
        //if-else method to print the result
        if (salary>=50000){
            System.out.println("You're Commission is 35%");
        }
        else if (salary>=30000) {
            System.out.println("You're commission is 20%");
        }
        else if (salary>=20000) {
            System.out.println("You're commission is 10%");
        }
        else if (salary>=10000) {
            System.out.println("You're commission is 5%");
        }
        else {
            System.out.println("You're commission is 2%");
        }
    }
}
