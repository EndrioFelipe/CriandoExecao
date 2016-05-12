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
public class DivZero extends Exception {
    
    int num1;
    
    int num2;
    public DivZero(int num1, int num2){
        super();
        this.num1=num1;
        this.num2=num2;
    }
    
    @Override
    public String toString(){
        return   "Numeros iguais";
    }
    public void imprimir(){
        System.out.println("n iguais");
    }
    
    
    
}

