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
public class removeDuplicates {

    public static void removeDuplicates(char[] str) {
        if (str == null) {
            return;
        }
        int len = str.length;
        if (len < 2) {
            return;
        }

        //int tail = 1;

        for (int i = 1; i < len; i++) {
            int j;
            for (j =0; j < len; j++) {
                if (str[i] == str[j] && str[j]!= 0 && i!=j) {
                    str[i] = 0;
                    break;
                }
            }
//            if (j == tail) {
//                str[tail] = str[i];
//                ++tail;
//            }
        }
//        str[tail] = 0;
    }

    public static void main(String[] args) {
        char[] test= new char[5];
        test[0] = 'a';
        test[1] = 'a';
        test[2] = 'a';
        test[3] = 'b';
        test[4] = 'a';
        for(int i=0; i<test.length; i++)
            System.out.println(test[i]); 
        removeDuplicates(test);
        System.out.println("After Remove Duplicates is run");
        for(int i=0; i<test.length; i++)
            System.out.println(test[i]);
    }
    
    
}


