/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mouse;

class Computer {
    private String merk;
    Mouse mouse;

    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMouse(String j, String m){
        mouse = new Mouse(j,m);
    }
    
    public String getJenisMouse(){
        return mouse.getJenis();
    }
    
    public String getModelmoude(){
        return mouse.getModel();
    }
    
}
