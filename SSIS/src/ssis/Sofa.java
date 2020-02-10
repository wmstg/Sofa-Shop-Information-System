/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssis;

/**
 * The Sofa class implements comparable so that compareTo can be defined.
 * 
 * @author G Williams
 */
public class Sofa implements Comparable<Sofa>{
    Double price;
    String name;
    
    @Override
    public int compareTo(Sofa sofa){
        return (this.price<sofa.getPrice() ? -1 :
                (this.price == sofa.getPrice() ? 0 : 1));
    }
    
    public Sofa(Double price, String name){
        this.price = price;
        this.name = name;
    }

    /**
     * Gets the sofas price
     * 
     * @return Double the price
     */
    public Double getPrice() {
        return this.price;
    }
    
    /**
     * Gets the sofas name
     * 
     * @return String the name
     */
    public String getName(){
        return this.name;
    }
}
