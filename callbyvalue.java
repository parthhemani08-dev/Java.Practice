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
}
