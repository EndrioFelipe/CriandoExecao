/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criandoexecao;

/**
 *
 * @author endrio
 */
import java.util.Scanner;

/**
 *
 * @author endrio
 */
public class Divisao  {

    
    
    
    public static void main(String[] args) {
        
    
        Scanner digita = new Scanner(System.in);
        int[] n1={5,4};
         int[] n2={3,4};
         
         
       
        try{
            for(int i=0;i<=n1.length;i++){
                if(n1[i]==n2[i]){
                    throw new DivZero(n1[i],n2[i]);
                }
                System.out.println((double)n1[i]/n2[i]);
            }
            
            
        
        }
        catch (DivZero e){
            
            e.printStackTrace();
            //System.out.println("asdada");
                
         
            
        }
        
       
    
}
}

