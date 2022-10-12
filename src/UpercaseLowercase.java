import java.util.Locale;
import java.util.Scanner;
public class UpercaseLowercase {
    //main method
    public static void main(String[] args) {
        String word;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre any word in uppercase ");
        word=scanner.next();
        String word2=word.toLowerCase(Locale.ROOT);
        System.out.println("Written in Lowercase = " +word2);

    }
}
