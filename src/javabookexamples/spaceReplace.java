/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabookexamples;

import java.util.Arrays;

/**
 *
 * @author John
 */
public class spaceReplace {
    
    public static void spaceReplace(char[] str){
        int length = str.length;
        int newLength, count=0;
        for(int i=0;i<length;i++){
            if(str[i] == ' ')
                count++;
        }
        newLength = length + count*2;
        str[newLength] = '\0';
        for(int i = length-1; i>=0; i--){
            if(str[i] == ' '){
                str[newLength-i] = '0';
                str[newLength-i-1] = '2';
                str[newLength-i-2] = '&';
                newLength = newLength - 3;
            }
            else{
                str[newLength-1] = str[i];
                newLength -= 1;
            }                
        }
    }
    
    public static void main(String[] args) {
        String test = new String("this is a test");
        char[] testarr = new char[test.length()];
        testarr = test.toCharArray();
        spaceReplace(testarr);
        System.out.println(Arrays.toString(testarr));
    }
    
}
