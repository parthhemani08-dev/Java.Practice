public class pattern6 {
    public static void main(String args[]) {
        int num = 1;
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= row; col++) {
                if(num == 1) {
                    System.out.print(num);
                    num -= 1;
                }
                else {
                    System.out.print(num);
                    num +=1;
                }       
            }
        System.out.println();    
        }
    }
}
