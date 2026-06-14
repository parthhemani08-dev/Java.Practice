package patterns;
public class pattern4 {
    public static void pyramid_number(int rows, int cols) {
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <= rows + 1 - row; col++) {
                System.out.print(col);
            } 
        System.out.println();             
        }
    }
    public static void main(String args[]) {
        pyramid_number(5 , 5);
    }
    
}
