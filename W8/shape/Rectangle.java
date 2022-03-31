/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author Suci Awalia Gardara
 */
public class Rectangle extends Shape{
    private Double width;
    private Double length;

    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(Double width, Double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, Boolean filled, Double width, Double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Double getArea(){
        return getLength() * getWidth();
    }

    public Double getPerimeter(){
        return 2 * (getWidth() + getLength());
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

}
