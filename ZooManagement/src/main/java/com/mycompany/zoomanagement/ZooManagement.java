

package com.mycompany.zoomanagement;


public class ZooManagement {

    public static void main(String[] args) {
        Animal dog = new Animal("spike", "dog dog",10,true);
        dog.Eat();
        
        Bird Pakhi = new Bird("MIthu","parrot",6,true,true,"greenish blue");
        
        System.out.println(Pakhi.name);
        
    }
}
