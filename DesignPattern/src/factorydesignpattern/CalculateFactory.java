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
public class CalculateFactory {
    
    public static ICalculate calcfactory(String classname)
    {
        if (classname.equalsIgnoreCase("Sum"))
        return new Sum();
        else if (classname.equalsIgnoreCase("Multiply"))
        return new Multiply();
        else if (classname.equalsIgnoreCase("Substract"))
        return new Substract();
        else if (classname.equalsIgnoreCase("Divide"))
        return new Divide();
        
        else
        return null;
    }
    
}
