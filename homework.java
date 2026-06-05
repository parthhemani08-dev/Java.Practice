import java.util.Scanner;

public class homework {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide the number : ");
        int number = sc.nextInt();
        if(number >= 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
        
        int week = sc.nextInt();
        switch (week) {
            case 1 : System.out.println("sunday");
            break;
            case 2 : System.out.println("sunday");
            break;
            case 3 : System.out.println("sunday");
            break;
            case 4 : System.out.println("sunday");
            break;
            case 5 : System.out.println("sunday");
            break;
            case 6 : System.out.println("sunday");
            break;
            case 7 : System.out.println("sunday");
            

        } 
        
    }
}