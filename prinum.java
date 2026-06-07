import java.util.Scanner;

public class prinum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean isprime = true;
        int n = sc.nextInt();
        if(n < 2) {
            System.out.println("not prime");
        }
        else {
            for(int i = n-1; i > 1; i--) {
            if(n % i == 0) {
                isprime = false;
            } 
        }
        if(isprime) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

        }
        
        
        
    }
}    
