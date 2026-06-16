package function_and_method;
import java.util.*;
public class multiply {
    public static int multiply1(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int num1 = 3;
         int num2 = 3;
         int answer = multiply1(num1 , num2);
         System.out.println(answer);
         answer = multiply1(6 , 7);
          System.out.println(answer);

    }
    
}
