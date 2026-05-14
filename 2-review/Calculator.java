
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String op=sc.next();
        switch (op) {
            case "+":
                System.out.println("Addition "+ a+b);
                break;
            case "-":
                System.out.println("Substraction " + (a-b));
                break;
            case "*":
                System.out.println("Product "+ a*b);
                break;
            case "%":
                System.out.println(" Remainder"+ a%b);
                break;
            case "/":
                System.out.println("Quotient "+ a/b);
                break;
            default:
                break;
        }
    }
}
