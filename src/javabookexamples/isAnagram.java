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
public class isAnagram {
    
    public static boolean isAnagram(String test, String compare){
        int len = test.length();
        if(len != compare.length())
            return false;
        char[] t = test.toCharArray();
        char[] c = compare.toCharArray();
        for(int i = 0; i < len; i++){ 
            int index = len-1-i;
            if(t[i] != c[index])
                return false;                
        }
        return true; 
    }
    
    public static void main(String[] args) {
        String test = "racecar";
        String comp = "racecar";
        System.out.println(isAnagram(test,comp));
    }
    
}
