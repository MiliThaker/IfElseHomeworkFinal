import  java.util.Scanner;
public class VowelOrConsonant {
//main method
    public static void main(String[] args) {
        //declaring char
       char letter;
       //creating objet
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre any letter");
        letter=scanner.next().charAt(0);
        //logic using if-else method
        if ((letter=='a')||(letter=='e')||(letter=='i')||(letter=='o')||(letter=='u')){
            System.out.println(letter+"This letter is Vowel");
        }
   else {
            System.out.println(letter+"This letter is Consonant");
        }

        }
    }

