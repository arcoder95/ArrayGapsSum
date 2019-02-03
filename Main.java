
import java.util.*;

public class Main {

    public static int valienMaara(long[] taulukko, long k) {
        long summa = 0;
        int maara = 0;
        int i = 0;
        
        while (i <= taulukko.length-1){
            
            for (int b = i; b <= taulukko.length -1; b++){
                if (taulukko[b] == k){

                    summa = 0;
                    break;
                    
                }else{
                    
                summa += taulukko[b];
                
                if (summa == k){
                    
                    maara++;
                    break;
                    
                }if (summa>k){
                     
                    break;
                }
                
                    
                }
            }i++;
            summa = 0;
            
        
        }
        for (long luku : taulukko){
            if (luku == k){
                maara++;
            }

        }
        return maara;
    }

    public static void main(String[] args) {
        
        System.out.println(valienMaara(new long[]{1, 1, 1, 1}, 4));
        System.out.println(valienMaara(new long[]{1, 1, 1, 1}, 1));
        System.out.println(valienMaara(new long[]{1, 2, 3, 4}, 3));
        System.out.println(valienMaara(new long[]{1, 3, 1, 2}, 3));

    }
}
