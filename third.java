import java.util.*;

public class third {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int table;
        for(int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.println(num + " * " + i + " = " + table);

        }
    } 
    
}
