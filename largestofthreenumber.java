import java.util.Scanner;

public class largestofthreenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number a b c : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if(a > b && a > c) {
            System.out.println("a is largest");
        }
        else if(b > a && b > c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }


    }
}