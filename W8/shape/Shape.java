/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

/**
 *
 * @author X1 Carbon
 */
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "" : "Not ") + "filled.";
    }
}
