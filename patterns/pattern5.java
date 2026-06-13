package patternall;
public class pattern5 {
    public static void floyd_triangle(int rows) {
        int count = 1;
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
        System.out.println();    
        }
    }

    public static void main(String args[]) {
        floyd_triangle(5);
    }
}    
