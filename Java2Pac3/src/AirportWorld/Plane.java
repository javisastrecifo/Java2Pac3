package AirportWorld;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Plane {

    private String name;
    private int passengers;

    public Plane(String name, int passengers) {
        this.name = name;
        this.passengers = passengers;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString (){
        return this.name + " (" + this.passengers + " ppl)"; 
    }
}
