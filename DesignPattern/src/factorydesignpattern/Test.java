/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author abdusselam.yuceer
 */
public class Test {
    public static void main(String[] args) {
        ICalculate calc =  CalculateFactory.calcfactory("Substract");
        
        System.out.println(calc.calculate(1, 2)); 
        
    }
    
}
