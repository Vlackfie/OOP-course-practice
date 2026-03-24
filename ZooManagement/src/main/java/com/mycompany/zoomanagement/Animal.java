/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoomanagement;

/**
 *
 * @author vlackfie
 */
public class Animal {
    public String name, species;
    public double height;
    public boolean hasTail;

    public Animal(String name, String species, double height, boolean hasTail) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.hasTail = hasTail;
    }
    
    
    
    public void Eat(){
        System.out.println(name + "is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
    
    
    
}
