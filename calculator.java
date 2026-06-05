import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.println("enter two number: ");
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        System.out.println("enter the operation to perform (+,-,*,/): ");
        char operator = sc.next().charAt(0);
        if(operator == '+') {
            ans = a + b;
        }
        else if(operator == '-') {
            ans = a - b;
        }
        else if(operator == '*') {
            ans = a * b;
        }
        else if(operator == '/') {
            ans = a / b;
        }
        else {
            System.out.println("enter right operator");
        }
        System.out.println(ans);
    }
}    

