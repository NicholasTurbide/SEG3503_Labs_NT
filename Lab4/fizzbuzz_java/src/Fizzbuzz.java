public class Fizzbuzz {
    
    public String fizz(int n){
        String modulo ="";

        if(n % 3 == 0){
            modulo = "fizz";
        }
        
        if(n % 5 == 0){
            modulo = "buzz";
        }

        if(n % 3 != 0 && n % 5 != 0){
           modulo = Integer.toString(n);
        }

        return modulo;
    }
}