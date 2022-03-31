/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Suci Awalia Gardara
 */
public class Circle extends Shape{
    private double radius;
    

    public Circle(){
        super();
        this.radius=1.0;
    }
    
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public Double getArea(){
        return 3.14 * Math.pow(getRadius(), 2);
    }
    public Double getPerimeter(){
        return 2 * 3.14 * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                ",radius=" + radius +
                '}';
    }
}
