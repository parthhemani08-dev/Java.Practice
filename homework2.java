import java.util.Scanner;

public class homework2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                evensum += i;
            }
            else {
                oddsum += i;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        


        int evensum1 = 0; 
        int oddsum1 = 0; 
        int count = sc.nextInt();
        for(int i = 1; i <= count; i++) {
            int num = sc.nextInt();

            if(num % 2 == 0) {
                evensum1 += num;
            }
            else {
                oddsum1 += num;
            }
        }
        System.out.println(evensum1);
        System.out.println(oddsum1);



        int f = sc.nextInt();
        int factorial = 1;
        for(int i = f-1; i > 1; i--) {
            factorial = f * i;
            f = factorial;
        }
        System.out.println(factorial);






        int num = sc.nextInt();
        int table;
        for(int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.println(num + " * " + i + " = " + table);

        }
    }
}    
