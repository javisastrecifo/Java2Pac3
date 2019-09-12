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
public class Flight {

    private Plane plane;
    private String origin;
    private String destination;

    public Flight(Plane plane, String ori, String dest) {
        this.plane = plane;
        this.origin = ori;
        this.destination = dest;
    }

    @Override
    public String toString(){
        return this.plane.toString() + " (" + this.origin + "-" + this.destination + ")";
    }
}
