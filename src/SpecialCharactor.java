import java.util.Scanner;
public class SpecialCharactor {
    public static void main(String[] args) {
//creating object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
//logic using if-else to find out the characters
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet.");
        } else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }
}
