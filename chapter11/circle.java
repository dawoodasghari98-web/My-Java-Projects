/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter11;

/**
 *
 * @author Mohammad Asif
 */
public class circle extends geometric_object{
int radius;

    public circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
       return  2*Math.PI*radius;
    }
    
}
