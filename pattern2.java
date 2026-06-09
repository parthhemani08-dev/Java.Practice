public class pattern2 {
    public static void hollow_rectangle(int rows, int cols) {
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <=  cols; col++) {
                if(row == 1 || row == rows || col == 1 || col == cols) {
                    System.out.print('*');
                }
                else {
                    System.out.print(" ");
                }
        
        }
        System.out.println();
    } 

    }
    public static void main(String args[]) {
        hollow_rectangle(6 , 7); 
    }
}      

