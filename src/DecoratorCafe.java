/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labs_2012
 */
public abstract class DecoratorCafe implements Complemento  {
   private Complemento cnp;
    
    public DecoratorCafe(Complemento c){
    this.cnp=c;
    }
     
    @Override
    public float calculaPreco() {
        return cnp.calculaPreco();
    }
    
}
