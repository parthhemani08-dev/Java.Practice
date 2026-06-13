package patternall;
public class pattern7 {
    public static void main(String args[]) {
        for(int row = 1; row <= 4; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            for(int col1 = 1; col1 <= 8 - 2 * row; col1++) {
                System.out.print(" ");
            }
            for(int col2 = 1; col2 <= row; col2++) {
                System.out.print('*');
            }
        System.out.println();    
        }
        for(int row = 4; row >= 1; row--) {
            for(int col = 1; col <= row; col++) {
                System.out.print('*');
            }
            for(int col1 = 1; col1 <= 8 - 2 * row; col1++) {
                System.out.print(" ");
            }
            for(int col2 = 1; col2 <= row; col2++) {
                System.out.print('*');
            }
        System.out.println(); 
        }
    }

}
