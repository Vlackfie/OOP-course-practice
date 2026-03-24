
package com.mycompany.zoomanagement;


public class Bird extends Animal {
    public boolean canFly; 
    public String featherColour; 

    public Bird(String name, String species, double height, boolean hasTail, boolean canFly, String featherColour) {
        super(name, species, height, hasTail);
        this.canFly = canFly;
        this.featherColour = featherColour; 
    }
    public void Fly(){
        if (canFly){
            System.out.println(name+" can fly");
            
            
        }else{
                    System.out.println(name +" Cant fly");
                    }
    }
    
}
