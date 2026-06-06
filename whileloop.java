import java.util.*;

public class whileloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while(count < n+1) {
            System.out.println(count);
            sum = sum + count;
            count++;
            
        }
        System.out.println(sum);
    }    
}    