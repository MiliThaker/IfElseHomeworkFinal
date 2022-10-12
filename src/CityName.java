import java.util.Scanner;
// class
public class CityName {
    //main method
    public static void main(String[] args) {
        //declaring variable
        String alphabet;
        //creating object using scanner method to print in console as output
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter letter in between a to f");
        alphabet=scanner.next();
        //creating switch  method to print the city-name as per alphabets in between a to f, else alphabets will not accept the result
        switch (alphabet)
        {
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Baroda");
                break;
            case "c":
                System.out.println("Charoda");
                break;
            case "d":
                System.out.println("Daman");
                break;
            case "e":
                System.out.println("Enasan");
                break;
            case "f":
                System.out.println("Fatepur");
            default:
                System.out.println("You have entered wrong alphabet");
                return;
        }
    }
}
