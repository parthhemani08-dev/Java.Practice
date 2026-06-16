package function_and_method;

public class bintodec {
    public static int decimal(int n) {
        int dec = 0;
        int pow1 = 0;
        int div;
        do {
            int ld = n % 10;
            div = n / 10;
            n = div;
            dec = dec + ld * (int)Math.pow(2 , pow1);
            pow1++;

        }while(div > 0);
    return dec;    
    }
    


    public static void main(String args[]) {
        System.out.println(decimal(1001001));
    }
}
