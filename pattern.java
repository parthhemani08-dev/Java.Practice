import java.util.*;

public class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int row = 1; row < 5 ; row++) {
            for(int col = 1; col < 5 ; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        int line = 1;
        while (line < 5) {
            System.out.println("****"); 
            line++;
        }
    
    }    
    
}    