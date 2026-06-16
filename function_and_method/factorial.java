package function_and_method;

public class factorial {

    public static int f(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }


    public static void main(String args[]){
        System.out.println(f(10));
        
    }
    
}
