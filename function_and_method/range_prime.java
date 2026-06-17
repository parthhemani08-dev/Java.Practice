package function_and_method;

public class range_prime {
    public static boolean isprime(int i) {
        for(int c = 2; c < i; c++) {
            if(i % c == 0) {
                return false;
            }  
        }
        return true;    
    }


    public static void prime_range(int n) {
        for(int d = 2; d <= n; d++) {
            if(isprime(d)) {
                System.out.println(d + " is prime");
            }
            
        }    
    }




    public static void main(String args[]) {
        prime_range(10);
    }
}
