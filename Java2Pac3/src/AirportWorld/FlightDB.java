package AirportWorld;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class FlightDB {

    private ArrayList<Flight> flightList;

    public FlightDB() {
        this.flightList = new ArrayList<Flight>();
    }

    public void createFlight(Plane plane, String ori, String dest) {
        Flight flight = new Flight(plane, ori, dest);
        this.flightList.add(flight);
    }

    public void printFlights() {
        for (Flight flight : this.flightList) {
            System.out.println(flight);
        }
    }
}
