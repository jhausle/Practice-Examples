/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabookexamples;

/**
 *
 * @author John
 */
public class isUnique {
    
public static boolean isUnique(String str){
	boolean[] val = new boolean[256];
	for(int i = 0; i < str.length(); i++){
		int value = str.charAt(i);
		if(val[value])
			return false;
		else
			val[value]=true;
		}
	return true;
}
    
}
