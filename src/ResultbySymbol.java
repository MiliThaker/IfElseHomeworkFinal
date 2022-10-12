import java.util.Scanner;
public class ResultbySymbol {
    public static void main(String[] args) {
        double num1, num2;
        //creating object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, /,*): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        System.out.print(num1+" "+operator+" "+num2+" = ");
//logic using switch to print the result entering symbol
        switch(operator)
        {
            case '+':
                System.out.print(num1+num2);
                break;
                case '-':
                    System.out.print(num1-num2);
                break;
                case '/':
                    System.out.print(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                // If user enters any other operator or char apart from +,- and / , then display an error message to user
            default:
                System.out.print("You have entered wrong operator");
                return;
        }

    }
}


