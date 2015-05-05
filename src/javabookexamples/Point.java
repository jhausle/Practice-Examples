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
public class Point {
    public int x;
    public int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void translate(int x, int y){
        this.x += x;
        this.y += y;
    }
    
    
}
