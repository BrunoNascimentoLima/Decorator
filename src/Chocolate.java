/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labs_2012
 */
public class Chocolate extends DecoratorCafe{
     public Chocolate(Complemento c){
    super(c);
    }
   public float calculaPreco(){
   float a =2.50f;
       System.out.println("Preço Chocolate:");
       return(a+super.calculaPreco());
   }    
    
}
