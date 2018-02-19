/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labs_2012
 */
public class Acucar extends DecoratorCafe {
   
	public Acucar(Complemento c){
    super(c);
    }
   
  public float calculaPreco(){
   float a =0.50f;
       System.out.println("Preço açucar:");
       return(a+super.calculaPreco());
   }    


}
