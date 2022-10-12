import java.util.Scanner;
//main class
public class MarkSheet {
    //declaring variables
    int maths;
    int english;
    int science;
    int rn;
    float total;
    static float percentage;
    String name;
    //creating class to print name,rn,marks for maths,eng and sci
    public void print(){
        //creating object
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre your name");
        name=scanner.nextLine();
        System.out.println("Entre your RN");
        rn=scanner.nextInt();
        System.out.print("Entre Marks for Maths= ");
        maths=scanner.nextInt();
        System.out.print("Entre Marks for Science= ");
        science=scanner.nextInt();
        System.out.print("Entre Marks for English= ");
        english=scanner.nextInt();
    }
    //creating class to calculate total and percentage
    public void calculate(){
        //logic
        total=maths+english+science;
        percentage=total/3;
    }
    // creating the class to display result of marks and percentage
    public void display(){
        //calling calculate class
        calculate();
        System.out.println("Total Marks = "+total);
        calculate();
        System.out.println("Percentage = "+percentage+"%");
    }
    public static void main(String[] args) {
        //main method, calling all the class
        MarkSheet markSheet=new MarkSheet();
       markSheet.print();
        markSheet.calculate();
       markSheet.display();
       //if-else method to give grade and result of pass or fail
        if((percentage>=80) && (percentage<=100))
        {System.out.println(" A+");}
        else if ((percentage>=60) && (percentage<=100)) {
            System.out.println(" A ");
        }
        else if ((percentage>=50) && (percentage<=100)) {
            System.out.println(" B ");
        }
        else if ((percentage>=35) && (percentage<=100)){
            System.out.println(" C ");}
        if (percentage>=35){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

    }
}