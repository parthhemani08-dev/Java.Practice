import java.util.Scanner;

public class homework {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("what is the cost of pen: ");
        float pen = sc.nextFloat();
        System.out.println("what is the cost of eraser: ");
        float eraser = sc.nextFloat();
        float p = (pencil + pencil * 18/100) + (pen + pen * 18/100) + (eraser + eraser * 18/100);
        System.out.println("your total is: ");
        System.out.println(p);


    }
}