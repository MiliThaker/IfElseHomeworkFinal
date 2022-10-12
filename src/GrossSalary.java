import java.util.Scanner;
//main class
public class GrossSalary {
    //declaring variables
    double salary,hra,ta,da,pf,gross;
    int id;
    String name;
    // created subclass to print output for name, id and salary using scanner
    public void print(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Seller's name");
        name=scanner.nextLine();
        System.out.println("Entre your ID");
        id=scanner.nextInt();
        System.out.println("Entre your Salary");
        salary=scanner.nextInt();
    }
    //created another subclass to calculate the hra,da,ta,ps and gross salary
    public void calculate(){
        hra=salary*10/100;
        da=salary*8/100;
        ta=salary*9/100;
        pf=salary*20/100;
        gross=salary+hra+ta+da+pf;
    }
    //created another subclass to display the result for calculate class
    public void display(){
        calculate();
        System.out.println("HRA= "+hra);
        calculate();
        System.out.println("DA= "+da);
        calculate();
        System.out.println("TA= "+ta);
        calculate();
        System.out.println("PF= "+pf);
        calculate();
        System.out.println("Gross Salary= "+gross);
    }
    //main method
    public static void main(String[] args) {
        GrossSalary grossSalary1=new GrossSalary();
        grossSalary1.print();
        grossSalary1.calculate();
        grossSalary1.display();
    }
}
