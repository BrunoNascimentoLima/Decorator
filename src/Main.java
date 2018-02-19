/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labs_2012
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafe c =new Cafe();
        System.out.println(c.calculaPreco());
        
        Acucar a= new Acucar(c);
        System.out.println(a.calculaPreco());
        
        Chocolate ch= new Chocolate(a);
        System.out.println(ch.calculaPreco());
    }
}
