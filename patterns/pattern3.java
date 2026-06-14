package patterns;
public class pattern3 {
    public static void inverted_pyramid(int rows, int cols) {
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <= rows - row; col++ ) {
                System.out.print(" ");
            } 
            for(int col = 1; col <= row; col++) {
                System.out.print('*');
            }
        System.out.println();
        }
    }
    public static void main(String arg[]) {
        inverted_pyramid(6, 6);
    }
}
