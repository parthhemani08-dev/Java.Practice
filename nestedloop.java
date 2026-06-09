import java.util.Scanner;

public class nestedloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col = 1; col <= n; col++) {
            for(int row = 1; row <= col; row++) {
                System.out.print(row);
            }
            System.out.println();
        }


        char a = 'A';
        for(int col1 = 1; col1 <= 4; col1++) {
            for(int row1 = 1; row1 <= col1; row1++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }

    }
}
