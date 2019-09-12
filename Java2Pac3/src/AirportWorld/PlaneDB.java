package AirportWorld;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mati
 */
public class PlaneDB {

    private ArrayList<Plane> planeList;

    public PlaneDB() {
        this.planeList = new ArrayList<Plane>();
    }

    public void createPlane(String name, int passengers) {
        Plane plane = new Plane(name, passengers);
        this.planeList.add(plane);
    }

    public void printPlanes() {
        for (Plane plane : this.planeList) {
            System.out.println(plane);
        }
    }
    
    public Plane findPlane (String name){
        for (Plane plane : this.planeList){
            if (plane.getName().equalsIgnoreCase(name)){
                return plane;
            }
        }
        System.out.println("not found");
        return null;
    }
    

}
