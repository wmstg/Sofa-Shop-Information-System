/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssis;

import java.util.ArrayList;

/**
 *
 * @author G Williams
 */
public class BinarySearch {
    
    /**
     * Using binary search algorithm, finds a value in the range 
     * of a sorted array list
     * 
     * @param arraylist The arraylist which to search
     * @param low The low index of the range
     * @param high The high index of the range
     * @param key The value to find
     * @return the index at which the value occurs otherwise -1 if not found
     */
    public int search(ArrayList<Sofa> price, int low, int high, Double value){
        if (low <= high){
            
            int mid = (low + high) / 2;
            
            if (value < price.get(mid).getPrice()){//((value.compareTo(price.get(mid))) < 0){
                return search(price, low, mid-1, value);
            }
            else if (value > price.get(mid).getPrice()){
                return search(price, mid+1, high, value);
            }
            else if (low!=mid){ // Find the first occurance
                return search(price, low, mid, value);
            }
            else {
                return mid;
            }
        }
        else {
            return -1;
        }
    }
    
}