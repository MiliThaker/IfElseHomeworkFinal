import java.util.Scanner;
public class PassOrFailAllSubject {
    //main method
    public static void main(String[] args) {
        //declaring variables
        String name;
        int rn,math,eng,sci;
        //creating object to print name ,rn, marks for maths,eng and sci
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre you Name");
        name=sc.nextLine();
        System.out.println("Entre your Roll-number");
        rn=sc.nextInt();
        System.out.println("Maths");
        math=sc.nextInt();
        System.out.println("English");
        eng=sc.nextInt();
        System.out.println("Science");
        sci=sc.nextInt();
        //logic using if-else to print the result pass or fail
        if((math>=35)&&(eng>=35)&&(sci>=35)){
            System.out.println("Pass");}
        else
            System.out.println("Fail");
    }



}
