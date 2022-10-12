import java.util.Scanner;
public class WeekName {
    //main method
    public static void main(String[] args) {
        int number;
        //creating object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weekday day number (1-7) : ");
        number= scanner.nextInt();
        //logic using switch to print the week name
        switch (number){
                case 1:
                        System.out.println("Monday");
                        break;
                case 2:
                    System.out.println("Tuesday");
                break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                System.out.println("Thursday");
                break;

                case 5:
                System.out.println("Friday");
                break;

                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                default:
                System.out.println("Please enter weekday number between 1-7.");
                return;
            }

        }
}
