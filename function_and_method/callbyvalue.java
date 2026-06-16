package function_and_method;
import java.util.*;
public class callbyvalue {
    public static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);


    }
    
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a , b);
    }
}  /* here when we pass the value of a and b , we actual just give the copy of variable not original 
      so if we take out the syso from function and put it in main we wont have swap in value cause 
      change in function doesnt bring change to original value */
